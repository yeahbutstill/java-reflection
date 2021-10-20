package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

    @Test
    void testPrimitiveType() {

        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());

    }

    @Test
    void testFieldPrimitive() throws NoSuchFieldException {

        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());

    }

    @Test
    void testGetFieldDataPrimitive() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");

        Person person = new Person();
        person.setAge(30);

        age.setAccessible(true);
        System.out.println(age.getInt(person));

    }

    @Test
    void testExeMthodPrimitiveType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Method setAge = personClass.getDeclaredMethod("setAge", int.class);

        Person person = new Person();
        setAge.invoke(person, 32);

        System.out.println(person.getAge());

    }
}
