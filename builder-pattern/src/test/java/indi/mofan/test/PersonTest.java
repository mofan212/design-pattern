package indi.mofan.test;

import indi.mofan.concrete.Student;
import indi.mofan.director.Person2Director;
import indi.mofan.entity.Person;
import indi.mofan.entity.Person2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author mofan 2021/2/3
 */
public class PersonTest {
    @Test
    public void testBuilder() {
        Person person = new Person.Builder("默", "烦", 1)
                .setAge(19)
                .setHeight(178.2)
                .build();
        assertNotNull(person);
        assertEquals("默", person.getFirstName());
        assertEquals("烦", person.getLastName());
        assertEquals(1, person.getGender().intValue());
        assertEquals(19, person.getAge().intValue());
        assertEquals(178.2, person.getHeight(), 0.0);
    }

    @Test
    public void testPerson2() {
        Person2Director director = new Person2Director();
        Student student = new Student("默", "烦", 1);
        director.makePerson2(student);
        Person2 person2 = student.getPerson2();
        assertEquals("默", person2.getFirstName());
        assertEquals("烦", person2.getLastName());
        assertEquals(1, person2.getGender().intValue());
        assertEquals(19, person2.getAge().intValue());
        assertEquals(178.2, person2.getHeight(), 0.0);
    }
}
