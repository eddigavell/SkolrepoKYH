package com.company.Lecture7;

public class Circle implements Shape{
    private int radie;
    double pi = Math.PI;

    Circle(int radie) {
        this.radie = radie;
    }


    public int getArea() {
        return (int) ((this.radie*this.radie) * this.pi);
    }
    public int getCircumference() {
        return (int) ((this.radie+this.radie)*pi);
    }
}
