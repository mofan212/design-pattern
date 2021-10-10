package indi.mofan.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author mofan
 * @date 2021/10/10 18:00
 */
public class CglibProxy {
    public static void main(String[] args) {
        // 创建原始对象
        StudentService studentService = new StudentService();
        // 使用 CGLib 创建代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(Thread.currentThread().getContextClassLoader());
        enhancer.setSuperclass(studentService.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, params, methodProxy) -> {
            System.out.println("--- cglib start ---");
            Object ret = method.invoke(studentService, params);
//            Object ret = methodProxy.invoke(studentService, params);
//            Object ret = methodProxy.invokeSuper(o, params);
            System.out.println("--- cglib end ---");
            return ret;
        });
        StudentService studentServiceProxy = (StudentService) enhancer.create();
        // 调用代理对象的方法
        studentServiceProxy.create(new Student());
        studentServiceProxy.delete(123456789L);
    }
}
