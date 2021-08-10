package indi.mofan.pattern;

/**
 * 观察者 2 号
 *
 * @author mofan
 * @date 2021/8/11 0:25
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void response() {
        System.out.println("观察者 2 号做出了响应...");
    }
}
