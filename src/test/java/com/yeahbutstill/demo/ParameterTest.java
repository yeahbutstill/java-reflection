package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void testGetParameters() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name : " + parameter.getName());
                System.out.println("Parameter Typr : " + parameter.getType());
            }
            System.out.println("============================================");
        }
    }

    @Test
    void testCallMethodObjWParam() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);
        Person person = new Person("Dani", "Setiawan", 28);
        setFirstName.invoke(person, "Joko");
        System.out.println(person.getFirstName());
    }
}
