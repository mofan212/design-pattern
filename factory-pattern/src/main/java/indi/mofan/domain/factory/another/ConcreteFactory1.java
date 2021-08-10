package indi.mofan.domain.factory.another;

import indi.mofan.domain.product.ConcreteProduct11;
import indi.mofan.domain.product.ConcreteProduct21;
import indi.mofan.domain.product.Product1;
import indi.mofan.domain.product.Product2;

/**
 * @author mofan
 * @date 2021/7/18 13:29
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        return new ConcreteProduct21();
    }
}
