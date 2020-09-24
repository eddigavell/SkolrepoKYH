package com.company.lecture5.Hund;

import java.util.Date;

class Dog extends Animal {
    private static int conversionRateForDogYears = 7;

    Dog(String inputName, String inputBreed, String inputCall, Date inputBirthday) {
        super(inputName, inputBreed, inputCall, inputBirthday);
    }

    Dog(String inputName, String inputBreed, String inputCall) {
        super(inputName, inputBreed, inputCall, new Date());
    }

    Dog(String inputName, String inputBreed) {
        super(inputName, inputBreed, "Okänd", new Date());
    }

    Dog(String inputName) {
        super(inputName, "Okänd", "Okänd", new Date());
    }

    static int convertHumanYearsToDogYears(int humanYears) {
        return humanYears * conversionRateForDogYears;
    }
}