package com.company.lecture5.INT;

public class Main {
    public static int resetInt(int i) {
        return i+1;
    }
    public static void resetInt2(int i) {
        i=6;
    }

    public static void main(String[] args) {
        System.out.println(resetInt(5));

        int j = 5;
        resetInt2(j);
        System.out.println(j);



    }
}