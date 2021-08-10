package indi.mofan.test;

import indi.mofan.duck.PekingDuck;
import indi.mofan.duck.ToyDuck;
import indi.mofan.duck.WildDuck;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan 2021/2/27
 */
public class DuckTest {
    @Test
    public void testDuck() {
        PekingDuck pekingDuck = new PekingDuck();
        try {
            pekingDuck.fly();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof UnsupportedOperationException);
        }

        ToyDuck toyDuck = new ToyDuck();
        try {
            toyDuck.swim();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof UnsupportedOperationException);
        }

        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.quack();
    }
}
