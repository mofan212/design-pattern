package indi.mofan.eventbus.listener;

import indi.mofan.eventbus.event.FailureEvent;
import org.greenrobot.eventbus.Subscribe;

/**
 * @author cheny
 * @date 2021/8/10 16:00
 */
public class FailureListener {
    @Subscribe
    public void onFailure(FailureEvent event) {
        System.out.println(event.getFailureMsg());
    }
}
