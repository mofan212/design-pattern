package indi.mofan.pattern;

/**
 * 具体的主题，或者说具体的被观察者
 *
 * @author mofan
 * @date 2021/8/11 0:21
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        // 通知观察者，让观察者做出响应
        for (Object obs : observers) {
            ((Observer) obs).response();
        }
    }
}
