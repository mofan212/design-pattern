package indi.mofan.test;

import indi.mofan.simple.Context;
import indi.mofan.simple.PromotionPlanA;
import indi.mofan.simple.PromotionPlanB;
import indi.mofan.simple.PromotionPlanC;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mofan 2021/2/27
 */
public class PromotionTest {
    @Test
    public void testPromotion() {
        // 使用促销方案 A
        Context contextA = new Context(new PromotionPlanA());
        contextA.userPromotionPlan();

        // 使用促销方案 B
        Context contextB = new Context(new PromotionPlanB());
        contextB.userPromotionPlan();

        // 使用促销方案 C
        Context contextC = new Context(new PromotionPlanC());
        contextC.userPromotionPlan();

        Context contextD = new Context(() -> System.out.println("促销方案 D"));
        contextD.userPromotionPlan();
    }

    @Test
    public void testSort() {
        Integer[] array = {9, 8, 7, 1, 2, 3};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(array));
    }
}
