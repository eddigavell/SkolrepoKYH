package com.company.lecture5.Hund;

public class Dog {
    private String name;
    private String breed;
    private String call;

    Dog(String inputName, String inputBreed) {
        this.name = inputName;
        this.breed = inputBreed;

        switch (this.breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }

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