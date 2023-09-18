package indi.mofan;

import indi.mofan.jdk.EventSource;
import indi.mofan.jdk.EventListener;
import indi.mofan.pattern.ConcreteObserverOne;
import indi.mofan.pattern.ConcreteObserverTwo;
import indi.mofan.pattern.ConcreteSubject;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/8/10 23:57
 */
public class TestObserver {
    @Test
    public void testJdkObserver() {
        // 创建事件源
        EventSource observable = new EventSource();
        // 设置监听器
        observable.addListener(new EventListener());
        // 调用方法，改变数值
        observable.changeNum(0);
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
