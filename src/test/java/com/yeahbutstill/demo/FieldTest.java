package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void testGetFields() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }
}
