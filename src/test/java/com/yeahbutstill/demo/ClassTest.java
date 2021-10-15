package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ClassTest {
    @Test
    void testCreateClass() throws ClassNotFoundException {
        // 3 Cara membuat Class
        Class<Person> personClass = Person.class;

        Class<?> personClass1 = Class.forName("com.yeahbutstill.demo.data.Person");

        Person person = new Person();
        Class<? extends Person> personClass2 = person.getClass();

        // Class<T> Method
        System.out.println(personClass.getSuperclass());
        System.out.println(Arrays.toString(personClass.getInterfaces()));
        System.out.println(Arrays.toString(personClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(personClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(personClass.getDeclaredFields()));
        System.out.println(personClass.getModifiers());
        System.out.println(personClass.getPackage());
        System.out.println(personClass.getName());

    }
}
