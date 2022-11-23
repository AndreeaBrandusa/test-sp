package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student implements Element {
    private String nume;
    private String email;

    private List<Element> elemente = new ArrayList<>();

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public void add(Element element) {
        elemente.add(element);
    }

    @Override
    public void print(){
        System.out.println(nume + ", " + email);
    }
}
