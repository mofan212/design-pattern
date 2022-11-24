package indi.mofan.test;

import indi.mofan.builder.Builder;
import indi.mofan.entity.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan
 * @date 2022/11/24 22:59
 */
public class BuilderTest {
    @Test
    public void test() {
        Student student = Builder.builder(Student::new)
                .with(Student::setName, "mofan")
                .with(Student::setAge, 20)
                .build();
        Assert.assertEquals("mofan", student.getName());
        Assert.assertEquals(20, student.getAge());
    }
}
