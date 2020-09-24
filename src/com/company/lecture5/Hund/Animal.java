package com.company.lecture5.Hund;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Animal {
    protected String name;
    protected String breed;
    protected String call;
    protected Date birthDate;

    protected Animal(String inputName, String inputBreed, String inputCall, Date inputBirthday) {
        this.name = inputName;
        this.breed = inputBreed;
        this.call = inputCall;
        this.birthDate = inputBirthday;
    }

    protected String getName() {
        return this.name;
    }

    protected String getCall() {
        return this.call;
    }

    protected void setName(String inputName) {
        this.name = inputName;
    }

    protected void call(String inputCall) {
        System.out.println(this.name + ": " + inputCall);
    }

    protected void call() {
        this.call(this.call);
    }

    protected String getAge() {
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

    protected Date getBirthDate() {
        return this.birthDate;
    }

    protected String getBreed() {
        return this.breed;
    }

    protected void setBreed(String inputBreed) {
        this.breed = inputBreed;
    }

    protected int calculateSpeed() {
        return this.name.length() * 5;
    }
}