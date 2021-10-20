package com.yeahbutstill.demo.validation;

import com.yeahbutstill.demo.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {
        // Get class
        Class<?> aClass = object.getClass();

        // Get all fields
        Field[] fields = aClass.getDeclaredFields();

        // Iterate each field
        for (Field field : fields) {
            // Get not blank annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            // Check if @NotBlank is exists
            if (notBlank != null) {
                // Get fields value
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (notBlank.allowEmptyString()) {
                    // Allow empty string
                    // Ignore
                } else {
                    // Not allow empty string
                    value = value.trim();
                }

                // Check if value is empty string
                if ("".equals(value)) {
                    // Throw error
                    throw new RuntimeException(field.getName() + " must not Blank");
                }
            }
        }
    }
}
