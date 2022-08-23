package com.company;

public class Main {
    public static void main(String[] args) {
        Person anatoly = new Person("Anatoly", 180, 85.5f);
        anatoly.printAllInfo();

        Person sergey = new Person();
        sergey.printAllInfo();

        Person pavel = new Student("Pavel", 190, 99.5f, 5);
        pavel.printAllInfo();

        System.out.print("Static: " + Person.sum);
        System.out.print("\nStatic + Final: " + Person.PI);
    }
}
