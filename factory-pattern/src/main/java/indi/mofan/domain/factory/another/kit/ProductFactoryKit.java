package indi.mofan.domain.factory.another.kit;

import indi.mofan.domain.product.Product;
import indi.mofan.domain.product.enums.ProductType;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author mofan
 * @date 2024/3/22 11:09
 */
public interface ProductFactoryKit {

    static ProductFactoryKit factory(Consumer<ProductFactoryBuilder> consumer) {
        var map = new HashMap<ProductType, Supplier<Product>>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }

    Product create(ProductType name);
}
