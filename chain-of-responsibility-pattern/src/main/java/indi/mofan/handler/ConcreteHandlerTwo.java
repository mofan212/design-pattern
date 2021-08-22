package indi.mofan.handler;

/**
 * 具体处理者 2 号
 *
 * @author mofan
 * @date 2021/8/22 19:11
 */
public class ConcreteHandlerTwo extends Handler {
    public static final String TWO = "two";
    @Override
    public String handleRequest(String request) {
        if (TWO.equals(request)) {
            return TWO;
        } else {
            if (this.getNext() != null) {
                return this.getNext().handleRequest(request);
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
