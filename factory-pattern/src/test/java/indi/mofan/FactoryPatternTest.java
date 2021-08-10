package indi.mofan;

import indi.mofan.domain.factory.AbstractFactory;
import indi.mofan.domain.factory.ConcreteFactory1;
import indi.mofan.domain.factory.ConcreteFactory2;
import indi.mofan.domain.product.ConcreteProduct1;
import indi.mofan.domain.product.ConcreteProduct2;
import indi.mofan.domain.product.Product;
import indi.mofan.domain.factory.SimpleFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan
 * @date 2021/7/17 22:40
 */
public class FactoryPatternTest {
    @Test
    public void testSimpleFactory() {
        Product product1 = SimpleFactory.makeProduct(1);
        Assert.assertNotNull(product1);
        Assert.assertTrue(product1 instanceof ConcreteProduct1);

        Product product2 = SimpleFactory.makeProduct(2);
        Assert.assertNotNull(product2);
        Assert.assertTrue(product2 instanceof ConcreteProduct2);

        Product product3 = SimpleFactory.makeProduct(3);
        Assert.assertNull(product3);
    }

    @Test
    public void testFactoryMethod() {
        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        Assert.assertNotNull(product1);
        Assert.assertTrue(product1 instanceof ConcreteProduct1);

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product product2 = concreteFactory2.newProduct();
        Assert.assertNotNull(product2);
        Assert.assertTrue(product2 instanceof ConcreteProduct2);
    }
}
