package indi.mofan.jdk;

import lombok.Getter;

import java.util.Observable;

/**
 * 数值被观察者
 *
 * @author mofan
 * @date 2021/8/10 23:50
 */
@Getter
public class NumberObservable extends Observable {
    private int num = 1;

    public void changeNum(int data) {
        this.num = data;
        // 标记当前对象已被改变
        this.setChanged();
        // 通知其他观察者
        this.notifyObservers(data);
    }
}
