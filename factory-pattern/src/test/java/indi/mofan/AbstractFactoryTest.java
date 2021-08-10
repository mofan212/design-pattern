package indi.mofan;

import indi.mofan.domain.factory.another.AbstractFactory;
import indi.mofan.domain.factory.another.ConcreteFactory1;
import indi.mofan.domain.factory.another.ConcreteFactory2;
import indi.mofan.domain.product.ConcreteProduct11;
import indi.mofan.domain.product.ConcreteProduct12;
import indi.mofan.domain.product.ConcreteProduct21;
import indi.mofan.domain.product.ConcreteProduct22;
import indi.mofan.domain.product.Product1;
import indi.mofan.domain.product.Product2;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan
 * @date 2021/7/18 13:33
 */
public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        Product1 product11 = concreteFactory1.newProduct1();
        Assert.assertNotNull(product11);
        Assert.assertTrue(product11 instanceof ConcreteProduct11);
        Product2 product21 = concreteFactory1.newProduct2();
        Assert.assertNotNull(product21);
        Assert.assertTrue(product21 instanceof ConcreteProduct21);

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product1 product12 = concreteFactory2.newProduct1();
        Assert.assertNotNull(product12);
        Assert.assertTrue(product12 instanceof ConcreteProduct12);
        Product2 product22 = concreteFactory2.newProduct2();
        Assert.assertNotNull(product22);
        Assert.assertTrue(product22 instanceof ConcreteProduct22);
    }
}
