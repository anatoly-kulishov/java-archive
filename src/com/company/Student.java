package com.company;

public class Student extends Person {
    public int course;

    public Student(String name, int height, float weight, int course) {
        super(name, height, weight);
        this.course = course;
    }

    public void printAllInfo() {
        System.out.print("Name: " + this.name + "\nHeight: " + this.height + "cm" + "\nWeight: " + this.weight + "kg" + "\nCourse: " + this.course + "\n\n");
    }
}

