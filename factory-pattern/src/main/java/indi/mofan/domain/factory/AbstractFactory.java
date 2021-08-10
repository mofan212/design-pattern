package indi.mofan.domain.factory;

import indi.mofan.domain.product.Product;

/**
 * @author mofan
 * @date 2021/7/17 23:30
 */
public interface AbstractFactory {
    /**
     * 生产产品
     * @return 生产出的产品
     */
    Product newProduct();
}
