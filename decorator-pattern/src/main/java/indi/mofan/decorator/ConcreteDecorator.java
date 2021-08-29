package indi.mofan.decorator;

import indi.mofan.component.Component;

/**
 * 具体装饰角色
 *
 * @author mofan
 * @date 2021/8/29 15:34
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的 addedFunction() 功能...");
    }
}
