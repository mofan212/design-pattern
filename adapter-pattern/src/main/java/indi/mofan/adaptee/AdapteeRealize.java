package indi.mofan.adaptee;

/**
 * @author mofan
 * @date 2021/7/18 19:13
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用...");
    }
}
