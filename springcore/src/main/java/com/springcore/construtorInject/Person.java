package com.springcore.construtorInject;

public class Person {
    private String name;
    private int personId;
    private Certificate certificate;

    // Constructor
    public Person(String name, int personId, Certificate certificate) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", personId=" + personId + ", certificate=" + certificate + "]";
    }
}
