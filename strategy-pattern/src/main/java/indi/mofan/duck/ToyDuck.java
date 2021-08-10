package indi.mofan.duck;

/**
 * @author mofan 2021/2/27
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = () -> {
            System.out.println("这鸭子能飞");
        };
        swimBehavior = () -> {
            throw new UnsupportedOperationException();
        };
        quackBehavior = () -> {
            System.out.println("这鸭子能叫");
        };
    }

    @Override
    public void display() {
        System.out.println("这是一只玩具鸭！");
    }
}
