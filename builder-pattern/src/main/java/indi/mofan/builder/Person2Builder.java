package indi.mofan.builder;

import indi.mofan.entity.Person2;

/**
 * @author mofan 2021/2/3
 */
public abstract class Person2Builder {
    public abstract void setAge();

    public abstract void setHeight();

    public abstract void  setWeight();

    public abstract void  setJob();

    public abstract Person2 getPerson2();
}
