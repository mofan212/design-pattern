package indi.mofan.adapter;

import indi.mofan.adaptee.Adaptee;
import indi.mofan.Target;

/**
 * @author mofan
 * @date 2021/7/18 18:35
 */
public class ObjectAdapter implements Target {

    private final Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
