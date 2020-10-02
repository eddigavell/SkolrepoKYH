package com.company.Lecture7;

//import java.lang.Math;

public class Triangle implements Shape {
    private int width;
    private int height;
    private int hyp;

    Triangle(int width, int height, int hyp) {
        this.width = width;
        this.height = height;
        this.hyp = hyp;
    }

    public int getArea() {
        return ((this.width * this.height) / 2);
    }

    public int getCircumference() {
        return this.width+this.height+this.hyp;
        //int hypo = (int) Math.sqrt((this.width*this.width) + (this.height*this.height));
        //return this.width+this.height+hypo;
    }
}
