package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class GenericTest {

    @Test
    void testParameterizedReturnType() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;

        Method getHobbies = personClass.getDeclaredMethod("getHobbies");

        Type returnType = getHobbies.getGenericReturnType();
        System.out.println(returnType.getClass());

        if (returnType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) returnType;
            System.out.println(parameterizedType.getRawType());
            System.out.println(parameterizedType.getOwnerType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }

    }

    @Test
    void testParameterizedParameterType() throws NoSuchMethodException {

        Class<Person> personClass = Person.class;

        Method getHobies = personClass.getDeclaredMethod("setHobbies", List.class);

        Type[] types = getHobies.getGenericParameterTypes();

        for (Type type : getHobies.getGenericParameterTypes()) {
            System.out.println(type.getClass());
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println(parameterizedType.getRawType());
                System.out.println(parameterizedType.getActualTypeArguments());
            }
        }

    }

    @Test
    void testParameterizedField() throws NoSuchFieldException {

        Class<Person> personClass = Person.class;

        Field hobbies = personClass.getDeclaredField("hobbies");
        Type type = hobbies.getGenericType();

        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            System.out.println(parameterizedType.getRawType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }

    }
}
