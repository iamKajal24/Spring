package com.springcore.construtorInject;

public class Certificate {
    private String courseName;

    public Certificate(String courseName) {
        this.courseName = courseName;
    }

    public Certificate() {
        super();
    }

    @Override
    public String toString() {
        return "Certificate [courseName=" + courseName + "]";
    }
}
