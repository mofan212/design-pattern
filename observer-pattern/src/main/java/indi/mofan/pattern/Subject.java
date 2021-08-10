package indi.mofan.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类，也可以理解为被观察者的抽象类
 *
 * @author mofan
 * @date 2021/8/11 0:16
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     *
     * @param observer 增加的观察者
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 删除的观察者
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();
}
