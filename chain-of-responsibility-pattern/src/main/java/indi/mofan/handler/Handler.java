package indi.mofan.handler;

/**
 * 抽象处理者
 *
 * @author mofan
 * @date 2021/8/22 19:03
 */
public abstract class Handler {
    /**
     * 链表的下一个对象
     */
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    /**
     * 处理请求的方法
     * @param request 请求信息
     * @return 处理结果
     */
    public abstract String handleRequest(String request);
}
