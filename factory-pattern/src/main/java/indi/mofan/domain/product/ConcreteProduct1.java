package indi.mofan.domain.product;

/**
 * @author mofan
 * @date 2021/7/17 19:46
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("我是具体产品 1 号...");
    }
}
