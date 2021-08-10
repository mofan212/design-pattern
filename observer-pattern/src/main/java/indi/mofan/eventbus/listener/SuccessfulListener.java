package indi.mofan.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import indi.mofan.eventbus.event.SuccessfulEvent;

/**
 * @author mofan
 * @date 2021/8/10 15:36
 */
public class SuccessfulListener {

    @Subscribe
    public void onSuccessful(SuccessfulEvent event) {
        System.out.println(event.getMsg());
    }
}
