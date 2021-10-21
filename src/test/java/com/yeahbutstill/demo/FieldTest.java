package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Collections;

public class FieldTest {
    @Test
    void testGetFields() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testFieldObject() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Dani", "Gandes", 17, Collections.singletonList("Berenang"));
        String result = (String) firstName.get(person1);
        System.out.println(result);

        Person person2 = new Person("Salindri", "Setiawan", 17, Collections.singletonList("Berenang"));
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetFieldsObject() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Dani", "Gandes", 17, Collections.singletonList("Berenang"));
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        firstName.set(person, "Joko");
        System.out.println(person.getFirstName());
    }
}
