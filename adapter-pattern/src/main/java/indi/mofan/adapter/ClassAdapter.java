package indi.mofan.adapter;

import indi.mofan.adaptee.Adaptee;
import indi.mofan.target.Target;

/**
 * @author mofan
 * @date 2021/7/18 18:17
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        this.specificRequest();
    }
}
