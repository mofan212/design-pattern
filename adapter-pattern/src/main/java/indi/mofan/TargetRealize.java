package indi.mofan;

/**
 * @author mofan
 * @date 2021/7/18 19:13
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用...");
    }
}
