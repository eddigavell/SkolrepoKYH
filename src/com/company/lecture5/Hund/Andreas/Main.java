package com.company.lecture5.Hund.Andreas;

import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Dog dog = new Dog("Axel", "Chihuahua");
        //System.out.println("Hunden heter " + dog.getName());
        //dog.bark();
        Dog dog2 = new Dog("Clemens", "Saint Bernard", new Date(118, 8, 20));
        //dog2.bark();
        //dog2.bark("Hello im a dog!");
        //dog.chase(dog2);
        /*System.out.println("Är det samma hund? " + dog.equals(dog));
        System.out.println(dog2.getAge());
        System.out.println(Dog.convertHumanYearsToDogYears(33));*/
        Cat cat = new Cat("El Gato");
        //cat.printSound();
        //System.out.println(cat.getName());
        Chicken chicken = new Chicken("Alexander");
        //chicken.printSound();
        chicken.getName();

    }
}
