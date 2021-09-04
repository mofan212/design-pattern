package indi.mofan.template;

/**
 * @author mofan
 * @date 2021/9/4 17:44
 */
public abstract class AbstractClass {
    /**
     * 模板方法
     * 使用 final 修饰，使子类无法重写
     */
    public final void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 具体方法
     * 在父类中就有具体的实现
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
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
