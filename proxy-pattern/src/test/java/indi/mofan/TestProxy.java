package indi.mofan;

import indi.mofan.proxy.OrderService;
import indi.mofan.proxy.OrderServiceProxy;
import indi.mofan.proxy.User;
import indi.mofan.proxy.UserService;
import indi.mofan.proxy.UserServiceProxy;
import org.junit.Test;

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
}
