package indi.mofan.duck;

import indi.mofan.improve.FlyBehavior;
import indi.mofan.improve.QuackBehavior;
import indi.mofan.improve.SwimBehavior;

/**
 * @author mofan 2021/2/27
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 展示鸭子信息
     */
    public abstract void display();

    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        if (swimBehavior != null) {
            swimBehavior.swim();
        }
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
