package indi.mofan.handler;

/**
 * 具体处理者 1 号
 *
 * @author mofan
 * @date 2021/8/22 19:05
 */
public class ConcreteHandlerOne extends Handler {
    public static final String ONE = "one";
    @Override
    public String handleRequest(String request) {
        if (ONE.equals(request)) {
            return ONE;
        } else {
            if (this.getNext() != null) {
                return this.getNext().handleRequest(request);
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
