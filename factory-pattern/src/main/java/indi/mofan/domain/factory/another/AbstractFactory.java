package indi.mofan.domain.factory.another;

import indi.mofan.domain.product.Product1;
import indi.mofan.domain.product.Product2;

/**
 * @author mofan
 * @date 2021/7/18 13:26
 */
public interface AbstractFactory {
    /**
     * 生产 Product1 类型的产品
     * @return Product1 类型的产品
     */
    Product1 newProduct1();

    /**
     * 生产 Product2 类型的产品
     * @return Product2 类型的产品
     */
    Product2 newProduct2();
}
