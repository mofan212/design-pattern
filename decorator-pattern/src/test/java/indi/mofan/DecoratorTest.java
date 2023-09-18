package indi.mofan;

import indi.mofan.component.Component;
import indi.mofan.component.ConcreteComponent;
import indi.mofan.decorator.ConcreteDecorator;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/8/29 15:37
 */
public class DecoratorTest {
    @Test
    public void testDecorator() {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("---------------------------------");
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
