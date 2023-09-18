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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author mofan
 * @date 2021/7/18 13:33
 */
public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        Product1 product11 = concreteFactory1.newProduct1();
        Assertions.assertNotNull(product11);
        Assertions.assertTrue(product11 instanceof ConcreteProduct11);
        Product2 product21 = concreteFactory1.newProduct2();
        Assertions.assertNotNull(product21);
        Assertions.assertTrue(product21 instanceof ConcreteProduct21);

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product1 product12 = concreteFactory2.newProduct1();
        Assertions.assertNotNull(product12);
        Assertions.assertTrue(product12 instanceof ConcreteProduct12);
        Product2 product22 = concreteFactory2.newProduct2();
        Assertions.assertNotNull(product22);
        Assertions.assertTrue(product22 instanceof ConcreteProduct22);
    }
}
