package com.company;

public class Person {
    protected String name;
    protected int height;
    protected float weight;
    public static int sum = 247;
    final static float PI = 3.14f;

    Person(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    Person() {}

    public void printAllInfo() {
        System.out.print("Name: " + this.name + "\nHeight: " + this.height + "cm" + "\nWeight: " + this.weight + "kg\n\n");
    }
}
