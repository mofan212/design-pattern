package indi.mofan.mediator;

import indi.mofan.component.Component;

/**
 * @author mofan
 * @date 2024/2/16 22:03
 */
public interface Mediator {
    /**
     * 注册
     */
    void register(Component component);

    /**
     * 转发
     */
    void relay(Component component);
}
