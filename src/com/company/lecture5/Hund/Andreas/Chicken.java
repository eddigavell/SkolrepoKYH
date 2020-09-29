package com.company.lecture5.Hund.Andreas;


public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    public void printSound() {
        System.out.println("Kuckelikuu!");
    }
    public String getName() {
        System.out.println("Kycklingen " + name);
        return "";
    }
}

