package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Person;
import com.yeahbutstill.demo.validation.Validator;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class AnnotationTest {
    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person = new Person("Dani", "    ", 28, Collections.singletonList("Berenang"));
        Validator.validateNotBlank(person);
    }
}
