package indi.mofan;

import lombok.Getter;
import lombok.Setter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackHelper;
import net.sf.cglib.proxy.Dispatcher;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.LazyLoader;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.NoOp;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * @author mofan
 * @date 2023/9/17 20:46
 */
public class CGLibCallBackTest implements WithAssertions {
    @Getter
    @Setter
    static class Person {
        private String name;
        private Integer age;

        public void sayHello() {
            System.out.println("Hello");
        }

        public void sayHelloWorld() {
            System.out.println("Hello World");
        }

        public String getMyName1() {
            return "mofan";
        }

        public String getMyName2() {
            return "mofan212";
        }
    }

    @Test
    public void testMethodInterceptor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, methodProxy) -> {
            System.out.println("before");
            Object res = methodProxy.invokeSuper(obj, args);
            System.out.println("after");
            return res;
        });

        Person person = (Person) enhancer.create();
        person.sayHello();
    }

    @Test
    public void testNoOp() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(NoOp.INSTANCE);

        Person person = (Person) enhancer.create();
        person.sayHello();
    }

    @Test
    public void testLazyLoader() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((LazyLoader) () -> {
            System.out.println("prepare loading");
            Person person = new Person();
            person.setName("mofan");
            System.out.println("after loading");
            return person;
        });

        Person person = (Person) enhancer.create();
        System.out.println("build");
        System.out.println(person.getName());
        System.out.println(person.getName());
    }

    @Test
    public void testDispatcher() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((Dispatcher) () -> {
            System.out.println("prepare loading");
            Person person = new Person();
            person.setName("mofan");
            System.out.println("after loading");
            return person;
        });

        Person person = (Person) enhancer.create();
        System.out.println("build");
        System.out.println(person.getName());
        System.out.println(person.getName());
    }

    @Test
    public void testInvocationHandler() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((InvocationHandler) (obj, method, args) -> {
            // 如果对参数中的 method 再次调用，会重复进入 InvocationHandler
            if (method.getReturnType() == void.class) {
                // 没有调用 method，因此不会执行原始方法
                System.out.println("hello world");
            }
            return null;
        });

        Person person = (Person) enhancer.create();
        person.sayHello();
    }

    @Test
    public void testFixedValue() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((FixedValue) () -> "默烦");

        Person person = (Person) enhancer.create();
        assertThat(person.getName()).isEqualTo("默烦");
        assertThat(person.getMyName1()).isEqualTo("默烦");
        assertThat(person.getMyName2()).isEqualTo("默烦");
    }

    @Test
    public void testCallbackHelper() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        CallbackHelper helper = new CallbackHelper(Person.class, new Class[0]) {
            @Override
            protected Object getCallback(Method method) {
                if (method.getReturnType() == void.class) {
                    return (MethodInterceptor) (obj, method1, args, methodProxy) -> {
                        System.out.println("before");
                        Object res = methodProxy.invokeSuper(obj, args);
                        System.out.println("after");
                        return res;
                    };
                } else if (method.getReturnType() == String.class) {
                    return (FixedValue) () -> "默烦";
                } else return NoOp.INSTANCE;
            }
        };

        enhancer.setCallbacks(helper.getCallbacks());
        enhancer.setCallbackFilter(helper);

        Person person = (Person) enhancer.create();
        person.sayHello();
        assertThat(person.getName()).isEqualTo("默烦");
        assertThat(person.getAge()).isNull();
    }

    @Test
    public void testCallbackFilter() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallbackFilter(method -> {
            String methodName = method.getName();
            if (methodName.equals("sayHello")) {
                return 0;
            } else if (methodName.equals("sayHelloWorld")) {
                return 1;
            }
            return 2;
        });

        Callback firstCallback = (MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("before getMyName1");
            Object invoke = methodProxy.invokeSuper(o, objects);
            System.out.println("after getMyName1");
            return invoke;
        };

        Callback secondCallback = (MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("before getMyName2");
            Object invoke = methodProxy.invokeSuper(o, objects);
            System.out.println("after getMyName2");
            return invoke;
        };

        enhancer.setCallbacks(new Callback[]{firstCallback, secondCallback, NoOp.INSTANCE});

        Person person = (Person) enhancer.create();
        person.sayHello();
        person.sayHelloWorld();
        assertThat(person.getName()).isNull();
        assertThat(person.getAge()).isNull();
    }
}
