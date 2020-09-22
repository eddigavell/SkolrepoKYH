package com.company.lecture5.Hund;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Axel", "Tax");
        System.out.println("Hunden heter " + dog.getName() + " och är av rasen " + dog.getBreed());
        dog.bark();
        System.out.println();

        Dog dog2 = new Dog("Fido", "Labrador");
        System.out.println("Hunden heter " + dog2.getName() + " och är av rasen " + dog2.getBreed());
        dog2.bark();
        System.out.println();

        System.out.println("hund 1 jagar hund 2");
        dog.chase(dog2);
        System.out.println("hund 2 jagar hund 1");
        dog2.chase(dog);

    }
}