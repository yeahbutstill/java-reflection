package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Product;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {

    @Test
    void testRecord() {

        Class<Product> productClass = Product.class;

        System.out.println(productClass.isRecord());
        System.out.println(Arrays.toString(productClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(productClass.getRecordComponents()));

    }

    @Test
    void testSetRecord() throws InvocationTargetException, IllegalAccessException {

        Product product = new Product("1", "Iphone", 200000000L);

        Class<Product> productClass = Product.class;
        RecordComponent component = Arrays.stream(productClass.getRecordComponents())
                .filter(recordComponent -> recordComponent.getName().equals("id"))
                .findFirst().get();
        Method method = component.getAccessor();

        System.out.println(method.invoke(product));

    }
}
