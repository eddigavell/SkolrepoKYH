package com.company.lecture5.Hund;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Dog {
    private String name;
    private String breed;
    private String call;
    private Date birthDate;

    Dog(String inputName, String inputBreed, Date birthDate) {
        this.name = inputName;
        this.breed = inputBreed;

        switch (this.breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }
        this.birthDate = birthDate;
    }

    void getAge() {

        Date timeNow = new Date();
        int timeNowYears = timeNow.getYear();
        int timeNowMonths = timeNow.getHours();
        int timeNowDays = timeNow.getDay();
        int timeNowHours = timeNow.getHours();
        int timeNowSeconds = timeNow.getSeconds();

        int birthDayInYears = this.birthDate.getYear();
        int birthDayInMonths = this.birthDate.getHours();
        int birthDayInDays = this.birthDate.getDay();
        int birthDayInHours = this.birthDate.getHours();
        int birthDayInSeconds = this.birthDate.getSeconds();

        int differenceYear = timeNowYears-birthDayInYears;
        int differenceMonths = timeNowMonths-birthDayInMonths;
        int differenceDays = timeNowDays-birthDayInDays;

        System.out.println();
        System.out.println("Tid just nu: " + timeNow);
        System.out.println("Föddes: " + this.birthDate);

        System.out.println("Hunden är " + differenceYear + "år och " + differenceMonths + "månader, " + differenceDays + "dagar gammal.");

        System.out.println(differenceDays);
        System.out.println(timeNowDays);
        System.out.println(birthDayInDays);


    }

    Date getBirthDate() {
        return this.birthDate;
    }

    String getName() {
        return this.name;
    }

    private void setName(String inputName) {
        this.name = inputName;
    }

    String getBreed() {
        return this.breed;
    }

    private void setBreed(String inputBreed) {
        this.breed = inputBreed;
    }

    void bark() {
            System.out.println(this.name + ": " + this.call);
    }

    void chase(Dog d) {
        this.bark();
        d.bark();
    }

    boolean eQuals(Dog d) {
        //System.out.println(name);
        //System.out.println(d.name);

        //System.out.println(breed);
        //System.out.println(d.breed);

        //System.out.println(call);
        //System.out.println(d.call);

        return name == d.name && breed == d.breed && call == d.call;
    }
}