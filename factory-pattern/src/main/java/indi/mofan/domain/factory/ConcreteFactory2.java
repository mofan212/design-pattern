package indi.mofan.domain.factory;

import indi.mofan.domain.product.ConcreteProduct2;
import indi.mofan.domain.product.Product;

/**
 * @author mofan
 * @date 2021/7/17 23:34
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
