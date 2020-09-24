package com.company.lecture5.Hund;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Dog {
    private String name;
    private String breed;
    private String call;
    private Date birthDate;

    private static int conversionRateForDogYears = 7;

    Dog(String name) {
        this.name = name;
        this.breed = "";

        switch (this.breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }
            this.birthDate = new Date();
    }

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;

        switch (this.breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }
        this.birthDate = new Date();
    }

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

    String getAge() {
        LocalDate now = LocalDate.now();
        Period result;
        LocalDate birthDate = this.birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        result = Period.between(birthDate, now);
        return result.getYears() + " " + result.getMonths() + " " + result.getDays();

        /*
        Date timeNow = new Date();

        int differenceYear = timeNow.getYear()-this.birthDate.getYear();
        int differenceMonths = timeNow.getMonth()-this.birthDate.getMonth();
        int differenceDays = timeNow.getDay()-this.birthDate.getDay();

        return "Hunden är " + differenceYear + "år och " + differenceMonths + "månader, " + differenceDays + "dagar gammal.";
        */
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

    void bark(String inputCall) {
        if (inputCall == null || inputCall.equals("")) {
            System.out.println(this.name + ": " + this.call);
        } else {
            System.out.println(this.name + " " + inputCall);
        }
    }
    void bark() {
        System.out.println(this.name + ": " + this.call);
    }
    void chase(Dog d) {
        this.bark("");
        d.bark("");
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

    public static int convertHumanYearsToDogYears(int humanYears) {
        return humanYears * conversionRateForDogYears;
    }
}