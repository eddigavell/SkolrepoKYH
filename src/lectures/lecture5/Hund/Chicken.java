package lectures.lecture5.Hund;

import java.util.Date;

class Chicken extends Animal {
    Chicken(String inputName, String inputBreed, String inputCall, Date inputBirthday) {
        super(inputName, inputBreed, inputCall, inputBirthday);
    }

    Chicken(String inputName, String inputBreed, String inputCall) {
        super(inputName, inputBreed, inputCall, new Date());
    }

    Chicken(String inputName, String inputBreed) {
        super(inputName, inputBreed, "Okänd", new Date());
    }

    Chicken(String inputName) {
        super(inputName, "Okänd", "Okänd", new Date());
    }

    protected String getName() {
        //System.out.println("Kycklingen " + this.name);
        return "Kycklingen " + this.name;
    }
}