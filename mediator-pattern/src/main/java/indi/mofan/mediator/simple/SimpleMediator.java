package indi.mofan.mediator.simple;

import indi.mofan.component.simple.SimpleComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * 简化的中介者，不定义接口，直接使用单例对象
 *
 * @author mofan
 * @date 2024/2/16 22:51
 */
public class SimpleMediator {
    private static final SimpleMediator MEDIATOR = new SimpleMediator();
    private final List<SimpleComponent> components;

    private SimpleMediator() {
        this.components = new ArrayList<>();
    }

    public static SimpleMediator getMediator() {
        return MEDIATOR;
    }

    public void register(SimpleComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        }
    }

    public void relay(SimpleComponent component) {
        this.components.stream()
                .filter(i -> !i.equals(component))
                .forEach(SimpleComponent::receive);
    }
}
