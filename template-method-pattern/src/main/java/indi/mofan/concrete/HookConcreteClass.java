package indi.mofan.concrete;

import indi.mofan.template.HookAbstractClass;

/**
 * 含有钩子方法的具体子类
 *
 * @author mofan
 * @date 2021/9/4 18:10
 */
public class HookConcreteClass extends HookAbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法 1 的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法 2 的实现被调用...");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法 1 被重写...");
    }

    @Override
    public boolean hookMethod2() {
        return false;
    }
}
