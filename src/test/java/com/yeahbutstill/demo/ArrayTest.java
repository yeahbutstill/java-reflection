package com.yeahbutstill.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    @Test
    void testArray() {

        Class<String[]> stringArrayClass = String[].class;
        Class<int[][]> intArrayClass = int[][].class;

        System.out.println(stringArrayClass.isArray());
        System.out.println(intArrayClass.isArray());

    }

    @Test
    void testArrayMember() {

        Class<String[]> stringArrayClass = String[].class;

        System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));

        System.out.println(stringArrayClass.getComponentType());

    }

    @Test
    void testArrayManipulation() {

        Class<String[]> stringArrayClass = String[].class;

        String[] array = (String[]) Array.newInstance(stringArrayClass.getComponentType(), 10);

        System.out.println(Arrays.toString(array));

        Array.set(array, 0, "Dani");
        Array.set(array, 1, "Setiawan");
        Array.set(array, 1, "Software Engineer");

        System.out.println(Arrays.toString(array));

        System.out.println(Array.get(array, 0));
        System.out.println(Array.get(array, 1));

    }

}
