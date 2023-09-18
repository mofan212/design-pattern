package indi.mofan;

import indi.mofan.adaptee.Adaptee;
import indi.mofan.adaptee.AdapteeRealize;
import indi.mofan.adaptee.TwoWayAdaptee;
import indi.mofan.adapter.ClassAdapter;
import indi.mofan.adapter.ObjectAdapter;
import indi.mofan.adapter.TwoWayAdapter;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/7/18 18:29
 */
public class AdapterTest {
    @Test
    public void testClassAdapter() {
        System.out.println("类适配器模式：");
        Target target = new ClassAdapter();
        target.request();
    }

    @Test
    public void testObjectAdapter() {
        System.out.println("对象适配器模式");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }

    @Test
    public void testTwoWay() {
        System.out.println("目标接口转换成适配者接口：");
        TwoWayTarget target = new TargetRealize();
        TwoWayAdaptee adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
        System.out.println("适配者接口转换成目标接口：");
        adaptee = new AdapteeRealize();
        target = new TwoWayAdapter(adaptee);
        target.request();
    }
}
