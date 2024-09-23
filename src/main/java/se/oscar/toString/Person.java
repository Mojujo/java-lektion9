package se.oscar.toString;

import java.security.InvalidAlgorithmParameterException;

public class Person {
    private String name;
    private int age;
    private Apartment apartment;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
    public Apartment getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", apartment=" + apartment +
                '}';
    }
}
