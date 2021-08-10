package indi.mofan;

import indi.mofan.jdk.NumberObservable;
import indi.mofan.jdk.NumberObserver;
import indi.mofan.pattern.ConcreteObserverOne;
import indi.mofan.pattern.ConcreteObserverTwo;
import indi.mofan.pattern.ConcreteSubject;
import org.junit.Test;

/**
 * @author mofan
 * @date 2021/8/10 23:57
 */
public class TestObserver {
    @Test
    public void testJdkObserver() {
        // 创建被观察者对象
        NumberObservable observable = new NumberObservable();
        // 为被观察者添加观察者
        observable.addObserver(new NumberObserver());
        // 调用方法，改变数值
        observable.changeNum(1);
        observable.changeNum(100);
    }

    @Test
    public void testObserverPattern() {
        // 获取主题，或者说获取被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 为其设置观察者
        subject.add(new ConcreteObserverOne());
        subject.add(new ConcreteObserverTwo());
        // 通知观察者做出响应
        subject.notifyObserver();
    }
}
