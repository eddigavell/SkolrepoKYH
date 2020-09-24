package com.company.lecture5.Hund;

import java.util.Date;

class Cat extends Animal {

    Cat(String inputName, String inputBreed, String inputCall, Date inputBirthday) {
        super(inputName, inputBreed, inputCall, inputBirthday);
    }

    Cat(String inputName, String inputBreed, String inputCall) {
        super(inputName, inputBreed, inputCall, new Date());
    }

    Cat(String inputName, String inputBreed) {
        super(inputName, inputBreed, "Okänd", new Date());
    }

    Cat(String inputName) {
        super(inputName, "Okänd", "Okänd", new Date());
    }
}