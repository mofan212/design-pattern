package indi.mofan;

import indi.mofan.handler.ConcreteHandlerOne;
import indi.mofan.handler.ConcreteHandlerTwo;
import indi.mofan.handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan
 * @date 2021/8/22 19:32
 */
public class ChainTest {
    @Test
    public void testChainOfResponsibilityPattern() {
        Handler handlerOne = new ConcreteHandlerOne();
        Handler handlerTwo = new ConcreteHandlerTwo();
        // 组装责任链
        handlerOne.setNext(handlerTwo);
        // 提交请求
        String response = handlerOne.handleRequest("one");
        Assert.assertEquals("one", response);
        response = handlerOne.handleRequest("two");
        Assert.assertEquals("two", response);
        try {
            handlerOne.handleRequest("three");
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof UnsupportedOperationException);
        }
    }
}
