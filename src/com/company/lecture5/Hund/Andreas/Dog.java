package com.company.lecture5.Hund.Andreas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Dog extends Animal {
    private String call = "Woof";
    private String breed;
    private Date birthDate;
    private static int conversionRateForDogYears = 7;

    public Dog(String name, String breed, Date birthDate) {
        super(name);
        this.breed = breed;
        if(breed.equals("Saint Bernard")) {
            call = "AUGHRUFF!";
        }
        this.birthDate = birthDate;
    }

    public Dog(String name, String breed) {
        this(name, breed, new Date());
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAge() {
        LocalDate now = LocalDate.now();
        Period result;
        LocalDate birthDate = this.birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        result = Period.between(birthDate, now);
        return result.getYears() + " " + result.getMonths() + " " + result.getDays();
    }

    public void bark(String message) {
        System.out.println(name + ": " + message);
    }

    public void bark() {
        bark(call);
    }

    public void chase(Dog d) {
        this.bark();
        d.bark();
    }

    public boolean equals(Dog d) {
        return this.hashCode() == d.hashCode();
    }

    public static int convertHumanYearsToDogYears(int humanYears) {
        return humanYears * conversionRateForDogYears;
    }
}
