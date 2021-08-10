package indi.mofan.adapter;

import indi.mofan.adaptee.TwoWayAdaptee;
import indi.mofan.target.TwoWayTarget;

/**
 * @author mofan
 * @date 2021/7/18 19:14
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {

    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
