package indi.mofan.mediator;

import indi.mofan.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mofan
 * @date 2024/2/16 22:09
 */
public class ConcreteMediator implements Mediator {

    private final List<Component> list = new ArrayList<>();

    @Override
    public void register(Component component) {
        if (!list.contains(component)) {
            list.add(component);
            component.setMediator(this);
        }
    }

    @Override
    public void relay(Component component) {
        list.stream()
                .filter(i -> !i.equals(component))
                .forEach(Component::receive);
    }
}
