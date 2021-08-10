package indi.mofan.simple;

/**
 * @author mofan 2021/2/27
 */
public class Context {
    private Promotion promotion;

    public Context(Promotion promotion) {
        this.promotion = promotion;
    }

    public void userPromotionPlan() {
        promotion.promote();
    }
}
