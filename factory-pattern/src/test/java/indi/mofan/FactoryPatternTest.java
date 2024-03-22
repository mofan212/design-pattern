package indi.mofan;

import indi.mofan.domain.factory.AbstractFactory;
import indi.mofan.domain.factory.ConcreteFactory1;
import indi.mofan.domain.factory.ConcreteFactory2;
import indi.mofan.domain.factory.SimpleFactory;
import indi.mofan.domain.factory.another.kit.ProductFactoryKit;
import indi.mofan.domain.product.ConcreteProduct1;
import indi.mofan.domain.product.ConcreteProduct2;
import indi.mofan.domain.product.Product;
import indi.mofan.domain.product.enums.ProductType;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/7/17 22:40
 */
public class FactoryPatternTest implements WithAssertions {
    @Test
    public void testSimpleFactory() {
        Product product1 = SimpleFactory.makeProduct(1);
        assertThat(product1).isInstanceOf(ConcreteProduct1.class);

        Product product2 = SimpleFactory.makeProduct(2);
        assertThat(product2).isInstanceOf(ConcreteProduct2.class);

        Product product3 = SimpleFactory.makeProduct(3);
        assertThat(product3).isNull();
    }

    @Test
    public void testFactoryMethod() {
        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        assertThat(product1).isInstanceOf(ConcreteProduct1.class);

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product product2 = concreteFactory2.newProduct();
        assertThat(product2).isInstanceOf(ConcreteProduct2.class);
    }

    @Test
    public void testFactoryKit() {
        ProductFactoryKit kit = ProductFactoryKit.factory(builder -> {
            builder.add(ProductType.ONE, ConcreteProduct1::new);
            builder.add(ProductType.TWO, ConcreteProduct2::new);
        });

        Product product = kit.create(ProductType.ONE);
        assertThat(product).isInstanceOf(ConcreteProduct1.class);

        product = kit.create(ProductType.TWO);
        assertThat(product).isInstanceOf(ConcreteProduct2.class);
    }
}
