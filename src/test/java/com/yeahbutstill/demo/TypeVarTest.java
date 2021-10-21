package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVarTest {

    @Test
    void testVariableDiClass() {

        Class<Data> dataClass = Data.class;
        for (TypeVariable<Class<Data>> typeParameter : dataClass.getTypeParameters()) {
            System.out.println(typeParameter.getName());
            System.out.println(Arrays.toString(typeParameter.getBounds()));
        }
    }
}
