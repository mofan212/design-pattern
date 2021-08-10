package indi.mofan.domain.factory;

import indi.mofan.domain.product.ConcreteProduct1;
import indi.mofan.domain.product.ConcreteProduct2;
import indi.mofan.domain.product.Product;

/**
 * @author mofan
 * @date 2021/7/17 19:49
 */
public final class SimpleFactory {
    /**
     * 根据产品编号生产产品
     *
     * @param productNum 产品编号
     * @return 生产出的产品
     */
    public static Product makeProduct(int productNum) {
        switch (productNum) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
