package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {
    @Test
    void testGetConstructor() {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
            System.out.println("==============================================");
        }
    }

    @Test
    void testCreatedObjWConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructorEmpty = personClass.getDeclaredConstructor();
        Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

        Person person1 = constructorEmpty.newInstance();
        Person person2 = constructorParameters.newInstance("Dani", "Setiawan");

        System.out.println(person1);
        System.out.println(person2);
    }
}
