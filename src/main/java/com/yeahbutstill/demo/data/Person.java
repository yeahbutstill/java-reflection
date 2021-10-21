package com.yeahbutstill.demo.data;

import com.yeahbutstill.demo.annotation.NotBlank;

import java.io.Serializable;
import java.util.List;

public class Person implements Nameable, Serializable {
    @NotBlank
    private String firstName;

    @NotBlank(allowEmptyString = true)
    private String lastName;

    private int age;

    private List<String> hobbies;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, List<String> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
