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

        dog.chase(dog2);

        dog2.chase(dog);

    }
}