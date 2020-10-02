package com.company.lecture8;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        int a, b;
        String method;

        System.out.println("Welcome to the Calculator!");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            a = sc.nextInt();
            method = sc.next();
            b = sc.nextInt();

            if (method.equals("+")) {
                System.out.println("The answer is: " + (add(a,b)));
            } else {
                System.out.println("The method of calculation is not supported yet");
            }
        }
    }

    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
