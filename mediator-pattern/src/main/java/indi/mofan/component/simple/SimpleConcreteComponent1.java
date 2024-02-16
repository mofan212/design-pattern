package indi.mofan.component.simple;

import indi.mofan.mediator.simple.SimpleMediator;

/**
 * @author mofan
 * @date 2024/2/16 23:00
 */
public class SimpleConcreteComponent1 extends SimpleComponent {

    @Override
    public void receive() {
        System.out.println("1 号简单组件收到请求");
    }

    @Override
    public void send() {
        System.out.println("1 号简单组件发出请求，请求转发...");
        SimpleMediator.getMediator().relay(this);
    }
}
