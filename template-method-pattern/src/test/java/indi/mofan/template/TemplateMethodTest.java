package indi.mofan.template;

import indi.mofan.concrete.ConcreteClass;
import indi.mofan.concrete.HookConcreteClass;
import org.junit.jupiter.api.Test;

/**
 * @author mofan
 * @date 2021/9/4 17:51
 */
public class TemplateMethodTest {
    @Test
    public void testTemplate() {
        AbstractClass cl = new ConcreteClass();
        cl.templateMethod();
    }

    @Test
    public void testHookTemplate() {
        HookAbstractClass hcl = new HookConcreteClass();
        hcl.templateMethod();
    }
}
