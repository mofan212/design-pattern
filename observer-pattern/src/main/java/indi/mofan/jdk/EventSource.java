package indi.mofan.jdk;

import lombok.Getter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 数值被观察者
 *
 * @author mofan
 * @date 2021/8/10 23:50
 */
@Getter
public class EventSource {
    private int num = 1;

    private final PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public void addListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        listeners.removePropertyChangeListener(listener);
    }

    public void changeNum(int data) {
        // 触发事件源
        listeners.firePropertyChange("num", this.num, data);
        this.num = data;
    }
}
