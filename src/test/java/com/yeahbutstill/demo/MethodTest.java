package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

public class MethodTest {
    @Test
    void testMethod() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("=========================================");
        }
    }

    @Test
    void testCallMethodObj() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person("Dani", "Setiawan", 28, Collections.singletonList("Berenang"));
        Class<Person> personClass = Person.class;
        Method getFirstName = personClass.getDeclaredMethod("getFirstName");
        Object response = getFirstName.invoke(person);
        System.out.println(response);
    }
}
