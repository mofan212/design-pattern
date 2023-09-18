package indi.mofan.jdk;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 数值观察者
 *
 * @author mofan
 * @date 2021/8/10 23:54
 */
public class EventListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("变化的属性是: " + evt.getPropertyName());
        System.out.println("值从: " + evt.getOldValue() + " 变化为: " + evt.getNewValue());
    }
}
