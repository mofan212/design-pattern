package indi.mofan.jdk;

import indi.mofan.proxy.User;
import indi.mofan.proxy.UserService;
import indi.mofan.proxy.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author mofan
 * @date 2021/10/10 15:18
 */
public class JdkProxy {
    public static void main(String[] args) {
        // 获取原始对象
        UserService userService = new UserServiceImpl();
        // 创建代理对象
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                userService.getClass().getInterfaces(),
                (proxy, method, params) -> {
                    System.out.println("--- start ---");
                    Object ret = method.invoke(userService, params);
                    System.out.println("--- end ---");
                    return ret;
                });
        // 调用代理对象的代理方法
        userServiceProxy.login("mofan", "123456");
        userServiceProxy.register(new User());
    }
}
