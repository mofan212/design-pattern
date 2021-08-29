package indi.mofan.component;

/**
 * 具体构件角色
 *
 * @author mofan
 * @date 2021/8/29 15:30
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent() {
        System.out.println("创建了具体构件角色...");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的 operation() 方法...");
    }
}
