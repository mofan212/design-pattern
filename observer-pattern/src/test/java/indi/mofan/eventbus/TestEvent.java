package indi.mofan.eventbus;

import com.google.common.eventbus.EventBus;
import indi.mofan.eventbus.event.FailureEvent;
import indi.mofan.eventbus.event.SuccessfulEvent;
import indi.mofan.eventbus.listener.FailureListener;
import indi.mofan.eventbus.listener.SuccessfulListener;
import org.junit.Test;

/**
 * @author mofan
 * @date 2021/8/10 15:49
 */
public class TestEvent {
    @Test
    public void testGuavaEventBus() {
       final EventBus eventBus = new EventBus();
        // 注册 Listener
        eventBus.register(new SuccessfulListener());
        // 发送事件
        eventBus.post(new SuccessfulEvent("监听到成功事件"));
    }

    @Test
    public void testGreenrobotEvent() {
        // 注册 Listener
        org.greenrobot.eventbus.EventBus.getDefault().register(new FailureListener());
        // 发送事件
        org.greenrobot.eventbus.EventBus.getDefault().post(new FailureEvent("监听到失败事件"));
    }
}
