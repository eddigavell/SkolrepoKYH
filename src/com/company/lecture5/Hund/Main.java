package com.company.lecture5.Hund;

import java.util.Date;

class Main {

    public static void main(String[] args) {
        //hundar
        Dog dog = new Dog("Axel", "Tax");
        //System.out.println("Hunden heter " + dog.getName() + " och är av rasen " + dog.getBreed() + ". Född: " + dog.getBirthDate());
        //dog.bark();
        //System.out.println();
        Dog dog3 = new Dog("Bosse", "Labradoodle");
        Dog dog2 = new Dog("Clemens", "Labrador", "asd", new Date(119,8,20));
        //System.out.println("Hunden heter " + dog2.getName() + " och är av rasen " + dog2.getBreed() + ". Född: " + dog2.getBirthDate());
        System.out.println(dog3.getBirthDate());
        System.out.println(dog2.getBirthDate());
        dog2.call();
        dog2.call("Hello Im a dog!");

        System.out.println();
        //Katter
        Cat cat = new Cat("Frasse", "Norsk bondkatt", "Miaooo", new Date (119,0,0));
        Cat cat1 = new Cat("Lasse");
        Cat cat2 = new Cat("Ferdinand" , "Mongol");
        System.out.println("Katten heter: " + cat.getName());

        System.out.println("Katt nr 2 heter " + cat2.getName() + " och låter så här: " + cat2.call);
        cat2.call();
        cat2.call("ABOOOOO");

        System.out.println();
        //Chicken
        Chicken chicken = new Chicken("Bobbo", "Kungsörn", "KRAAAW KRAAAAW", new Date(119,5,1));
        Chicken chicken1 = new Chicken("Bobbo1");
        chicken.call();
        chicken1.call();
        System.out.println(chicken.getName() + " " + chicken.getCall());
        System.out.println(chicken.getName());
        System.out.println(dog.getName());

        Animal animal = new Cat("Pippi");

        System.out.println(animal.getName());
    }
}