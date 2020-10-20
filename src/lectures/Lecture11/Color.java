package Lecture11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Color {

    public static void swap(List l, int i, int j) {
        //Collections.swap(l, i ,j);

        Object x = l.get(i);
        l.set(i, l.get(j));
        l.set(j, x);
    }

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow"); //3
        colors.add("Purple"); //4

        swap(colors, 3, 4);

        for(String color: colors) {
            System.out.println(color);
        }
    }
}

