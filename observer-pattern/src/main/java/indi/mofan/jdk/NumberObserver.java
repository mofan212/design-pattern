package indi.mofan.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 数值观察者
 *
 * @author mofan
 * @date 2021/8/10 23:54
 */
public class NumberObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        // 当有观察者发生变化时，会自动调用该方法
        // 获取被观察者对象
        NumberObservable observable = (NumberObservable) o;
        System.out.println("数值改变为：" + observable.getNum() + "(使用被观察者对象获取)");
        System.out.println("数值改变为：" + arg + "(使用方法参数获取)");
    }
}
