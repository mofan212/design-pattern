package indi.mofan.component;

/**
 * @author mofan
 * @date 2024/2/16 22:13
 */
public class ConcreteComponent1 extends Component {
    @Override
    public void receive() {
        System.out.println("1 号组件收到请求");
    }

    @Override
    public void send() {
        System.out.println("1 号组件发出请求，请求转发...");
        mediator.relay(this);
    }
}
