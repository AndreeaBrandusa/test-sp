package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    private String nume;
    private List<Element> elemente = new ArrayList<>();

    public Grupa(String nume) {
        this.nume = nume;
    }

    @Override
    public void add(Element element) {
        elemente.add(element);
    }

    @Override
    public void print(){
        System.out.println(nume);
    }
}
