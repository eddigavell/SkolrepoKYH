package com.company.lecture5.Hund;

public class Dog {
    String name;
    String breed;
    String call;

    Dog(String inputName, String inputBreed) {
        name = inputName;
        breed = inputBreed;

        switch (breed) {
            case "Tax" -> call = "Woof";
            case "Labrador" -> call = "WOOOOOFFF";
            case "Saint Bernard" -> call = "Nöff";
            case "Chihuahua" -> call = "Tjaru";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String inputBreed) {
        breed = inputBreed;
    }

    public void bark() {
            System.out.println(name + ": " + call);
    }

    public void chase(Dog d) {
        bark();
        d.bark();
    }
}