package indi.mofan.test;

import indi.mofan.entity.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author mofan 2021/2/3
 */
public class AnimalTest {
    @Test
    public void testAnimal() {
        Animal animal = Animal.builder("Dog")
                .name("小黑")
                .gender(1)
                .build();
        assertEquals("小黑", animal.getName());
        assertEquals(1, animal.getGender().intValue());
        assertEquals("Dog", animal.getType());
        assertNull(animal.getAge());
    }
}
