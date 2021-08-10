package indi.mofan.pattern;

/**
 * 观察者 1 号
 *
 * @author mofan
 * @date 2021/8/11 0:23
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void response() {
        System.out.println("观察者 1 号做出了响应...");
    }
}
