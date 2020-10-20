package Lecture11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    Lists() {
        testArray();
        testLists();
    }

    void testArray() {
        System.out.println("Arrays: ");
        Integer[] ints = new Integer[5];

        Arrays.fill(ints, 1);

        for (int i: ints) {
            System.out.println(i);
        }
        System.out.println();
    }

    void testLists() {
        System.out.println("Lists: ");
        List<Integer> ints2 = new ArrayList<>();

        ints2.add(1);
        ints2.add(2);
        ints2.add(3);
        ints2.add(4);
        ints2.add(5);
        ints2.remove(3);
        ints2.set(2, 10);

        for (int i: ints2) {
            System.out.println(i);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        new Lists();


    }
}
