package indi.mofan;

import indi.mofan.cglib.AbstractStudentService;
import indi.mofan.cglib.Student;
import indi.mofan.proxy.OrderService;
import indi.mofan.proxy.OrderServiceProxy;
import indi.mofan.proxy.User;
import indi.mofan.proxy.UserService;
import indi.mofan.proxy.UserServiceProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/10/10 14:49
 */
public class TestProxy {
    @Test
    public void testStaticProxy() {
        UserService userService = new UserServiceProxy();
        userService.register(new User());
        userService.login("mofan", "123456");

        System.out.println("=================================");

        OrderService orderService = new OrderServiceProxy();
        orderService.showOrder();
    }

    @Test
    public void testAbstractCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(Thread.currentThread().getContextClassLoader());
        enhancer.setSuperclass(AbstractStudentService.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            System.out.println("--- Abstract CGLib ---");
            return proxy.invokeSuper(obj, args);
        });
        AbstractStudentService serviceProxy = (AbstractStudentService) enhancer.create();
        serviceProxy.update(new Student());
    }
}
