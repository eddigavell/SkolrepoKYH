package com.company.lecture5.Hund;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Axel", "Tax", new Date());
        System.out.println("Hunden heter " + dog.getName() + " och är av rasen " + dog.getBreed() + ". Född: " + dog.getBirthDate());
        dog.bark();
        System.out.println();

        Dog dog2 = new Dog("Fido", "Labrador", new Date(119,8,20));
        System.out.println("Hunden heter " + dog2.getName() + " och är av rasen " + dog2.getBreed() + ". Född: " + dog2.getBirthDate());
        dog2.bark();
        System.out.println();
        //Dog dog3 = new Dog("Fido", "Labrador");


        System.out.println("hund 1 jagar hund 2");
        dog.chase(dog2);
        System.out.println("hund 2 jagar hund 1");
        dog2.chase(dog);
        dog2.getAge();
        //Dog dog4 = new Dog("Fido", "Tax");
        //System.out.println(dog2.eQuals(dog));
        //System.out.println(dog2.eQuals(dog3));
        //System.out.println(dog2.eQuals(dog4));

        //System.out.println(dog2.equals(dog3));
        //System.out.println(dog2);
        //System.out.println(dog3);
    }
}