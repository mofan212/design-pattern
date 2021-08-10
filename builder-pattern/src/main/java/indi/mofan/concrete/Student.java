package indi.mofan.concrete;

import indi.mofan.builder.Person2Builder;
import indi.mofan.entity.Person2;

/**
 * @author mofan 2021/2/3
 */
public class Student extends Person2Builder {

    private Person2 person2;

    public Student(String firstName, String lastName,
                   Integer gender) {
        person2 = new Person2(firstName, lastName, gender);
    }

    @Override
    public void setAge() {
        person2.setAge(19);
    }

    @Override
    public void setHeight() {
        person2.setHeight(178.2);
    }

    @Override
    public void setWeight() {
        person2.setWeight(125.6);
    }

    @Override
    public void setJob() {
        person2.setJob(null);
    }

    @Override
    public Person2 getPerson2() {
        return person2;
    }
}
