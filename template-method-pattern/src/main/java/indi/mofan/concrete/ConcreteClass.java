package indi.mofan.concrete;

import indi.mofan.template.AbstractClass;

/**
 * @author mofan
 * @date 2021/9/4 17:47
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法 1 的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法 2 的实现被调用...");
    }
}
