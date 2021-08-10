package indi.mofan.duck;

/**
 * @author mofan 2021/2/27
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = () -> { throw new  UnsupportedOperationException(); };
        swimBehavior = () -> { throw new  UnsupportedOperationException(); };
        quackBehavior = () -> { throw new  UnsupportedOperationException(); };
    }

    @Override
    public void display() {
        System.out.println("这是一只北京烤鸭！");
    }
}
