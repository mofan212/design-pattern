package indi.mofan;

import indi.mofan.handler.ConcreteHandlerOne;
import indi.mofan.handler.ConcreteHandlerTwo;
import indi.mofan.handler.Handler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals("one", response);
        response = handlerOne.handleRequest("two");
        Assertions.assertEquals("two", response);
        try {
            handlerOne.handleRequest("three");
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertTrue(e instanceof UnsupportedOperationException);
        }
    }
}
