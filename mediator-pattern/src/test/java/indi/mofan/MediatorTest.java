package indi.mofan;

import indi.mofan.component.ConcreteComponent1;
import indi.mofan.component.ConcreteComponent2;
import indi.mofan.mediator.ConcreteMediator;
import indi.mofan.mediator.Mediator;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2024/2/16 22:24
 */
public class MediatorTest {
    @Test
    public void test() {
        Mediator mediator = new ConcreteMediator();
        ConcreteComponent1 component1 = new ConcreteComponent1();
        mediator.register(component1);
        ConcreteComponent2 component2 = new ConcreteComponent2();
        mediator.register(component2);

        // 组件 1 号发出请求，其他组件会收到请求
        component1.send();
    }
}
