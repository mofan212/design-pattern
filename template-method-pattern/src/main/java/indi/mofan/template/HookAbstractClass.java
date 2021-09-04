package indi.mofan.template;

/**
 * 含有钩子方法的抽象模板类
 *
 * @author mofan
 * @date 2021/9/4 18:08
 */
public abstract class HookAbstractClass {
    /**
     * 模板方法
     * 指定方法的执行顺序
     */
    public final void templateMethod() {
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 钩子方法 1
     */
    public void hookMethod1() {
    }

    /**
     * 钩子方法2
     *
     * @return true or false
     */
    public boolean hookMethod2() {
        return true;
    }

    /**
     * 抽象方法 1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法 2
     */
    public abstract void abstractMethod2();
}
