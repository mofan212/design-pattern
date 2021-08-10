package indi.mofan.domain.factory;

import indi.mofan.domain.product.ConcreteProduct1;
import indi.mofan.domain.product.Product;

/**
 * @author mofan
 * @date 2021/7/17 23:33
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
