package com.company.Lecture7;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 6);
        System.out.println("Arean för en rektangel: " + rect.getArea() + " \n             omkrets: " + rect.getCircumference());

        Shape tri = new Triangle(5, 6);
        System.out.println("Arean för en triangel: " + tri.getArea() + " \n             omkrets: " + tri.getCircumference());
    }
}