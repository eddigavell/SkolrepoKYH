package com.company.lecture5.Hund;

public class Dog {
    private String name;
    private String breed;
    private String call;

    protected Dog(String inputName, String inputBreed) {
        this.name = inputName;
        this.breed = inputBreed;

        switch (this.breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }

    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String inputName) {
        this.name = inputName;
    }

    protected String getBreed() {
        return this.breed;
    }

    protected void setBreed(String inputBreed) {
        this.breed = inputBreed;
    }

    protected void bark() {
            System.out.println(this.name + ": " + this.call);
    }

    protected void chase(Dog d) {
        this.bark();
        d.bark();
    }
}