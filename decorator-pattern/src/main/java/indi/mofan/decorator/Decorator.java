package indi.mofan.decorator;

import indi.mofan.component.Component;

/**
 * 抽象装饰角色
 *
 * @author mofan
 * @date 2021/8/29 15:32
 */
public class Decorator implements Component {
    /**
     * 某一具体的构件角色
     */
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
