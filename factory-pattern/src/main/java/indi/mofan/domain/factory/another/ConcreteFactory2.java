package indi.mofan.domain.factory.another;

import indi.mofan.domain.product.ConcreteProduct12;
import indi.mofan.domain.product.ConcreteProduct22;
import indi.mofan.domain.product.Product1;
import indi.mofan.domain.product.Product2;

/**
 * @author mofan
 * @date 2021/7/18 13:30
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduct2() {
        return new ConcreteProduct22();
    }
}
