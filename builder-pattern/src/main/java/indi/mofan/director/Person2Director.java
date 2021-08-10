package indi.mofan.director;

import indi.mofan.builder.Person2Builder;

/**
 * @author mofan 2021/2/3
 */
public class Person2Director {
    public void makePerson2(Person2Builder builder) {
        /*
         * 要为目标实体设置那些可选参数就在此设置
         * 比如，我只想让我的目标实体具有 age 和 height 两个可选属性值
         */
        builder.setAge();
        builder.setHeight();
    }
}
