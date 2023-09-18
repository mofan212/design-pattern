package indi.mofan;

import indi.mofan.domain.factory.AbstractFactory;
import indi.mofan.domain.factory.ConcreteFactory1;
import indi.mofan.domain.factory.ConcreteFactory2;
import indi.mofan.domain.factory.SimpleFactory;
import indi.mofan.domain.product.ConcreteProduct1;
import indi.mofan.domain.product.ConcreteProduct2;
import indi.mofan.domain.product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/7/17 22:40
 */
public class FactoryPatternTest {
    @Test
    public void testSimpleFactory() {
        Product product1 = SimpleFactory.makeProduct(1);
        Assertions.assertNotNull(product1);
        Assertions.assertTrue(product1 instanceof ConcreteProduct1);

        Product product2 = SimpleFactory.makeProduct(2);
        Assertions.assertNotNull(product2);
        Assertions.assertTrue(product2 instanceof ConcreteProduct2);

        Product product3 = SimpleFactory.makeProduct(3);
        Assertions.assertNull(product3);
    }

    @Test
    public void testFactoryMethod() {
        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        Assertions.assertNotNull(product1);
        Assertions.assertTrue(product1 instanceof ConcreteProduct1);

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product product2 = concreteFactory2.newProduct();
        Assertions.assertNotNull(product2);
        Assertions.assertTrue(product2 instanceof ConcreteProduct2);
    }
}
