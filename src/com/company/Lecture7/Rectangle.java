package com.company.Lecture7;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getArea() {
        return this.width * this.height;
    }

    int getCircumference() {
        return ((this.width*2) + (this.height*2));
    }
}
