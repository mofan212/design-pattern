package indi.mofan.component;

import indi.mofan.mediator.Mediator;

/**
 * @author mofan
 * @date 2024/2/16 22:05
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
