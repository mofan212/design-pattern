package indi.mofan.test;

import indi.mofan.duck.PekingDuck;
import indi.mofan.duck.ToyDuck;
import indi.mofan.duck.WildDuck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author mofan 2021/2/27
 */
public class DuckTest {
    @Test
    public void testDuck() {
        PekingDuck pekingDuck = new PekingDuck();
        try {
            pekingDuck.fly();
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertTrue(e instanceof UnsupportedOperationException);
        }

        ToyDuck toyDuck = new ToyDuck();
        try {
            toyDuck.swim();
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertTrue(e instanceof UnsupportedOperationException);
        }

        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.quack();
    }
}
