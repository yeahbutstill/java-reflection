package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

public class SuperTest {
    @Test
    void testSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass); // Object

        Class<? super Person> superclassTop = superclass.getSuperclass();
        System.out.println(superclassTop); // Null
    }
}
