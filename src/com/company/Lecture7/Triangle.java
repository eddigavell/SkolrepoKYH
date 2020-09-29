package com.company.Lecture7;

import java.lang.Math;

public class Triangle implements Shape {
    private int width;
    private int height;

    Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return ((this.width * this.height) / 2);
    }

    public int getCircumference() {
        int hypotenysan = (int) Math.sqrt((this.width*this.width) + (this.height*this.height));
        return this.width+this.height+hypotenysan;
    }
}
