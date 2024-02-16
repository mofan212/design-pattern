package indi.mofan.component.simple;

import indi.mofan.mediator.simple.SimpleMediator;

/**
 * @author mofan
 * @date 2024/2/16 22:53
 */
public abstract class SimpleComponent {

    public SimpleComponent() {
        SimpleMediator.getMediator().register(this);
    }

    /**
     * 接收
     */
    public abstract void receive();

    /**
     * 发送
     */
    public abstract void send();
}
