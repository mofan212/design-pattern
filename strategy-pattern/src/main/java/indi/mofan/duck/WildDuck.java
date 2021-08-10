package indi.mofan.duck;

/**
 * @author mofan 2021/2/27
 */
public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = () -> {
            System.out.println("野鸭能飞");
        };
        swimBehavior = () -> {
            System.out.println("野鸭能游泳");
        };
        quackBehavior = () -> {
            System.out.println("野鸭能叫");
        };
    }

    @Override
    public void display() {
        System.out.println("这是一只野鸭！");
    }
}
