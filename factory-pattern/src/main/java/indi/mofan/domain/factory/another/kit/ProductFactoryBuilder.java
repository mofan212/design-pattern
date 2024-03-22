package indi.mofan.domain.factory.another.kit;

import indi.mofan.domain.product.Product;
import indi.mofan.domain.product.enums.ProductType;

import java.util.function.Supplier;

/**
 * @author mofan
 * @date 2024/3/22 11:06
 */
public interface ProductFactoryBuilder {
    /**
     * 添加产品工厂
     */
    void add(ProductType type, Supplier<Product> supplier);
}
