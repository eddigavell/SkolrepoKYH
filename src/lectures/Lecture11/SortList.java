package Lecture11;

import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static void swap(List l, int i, int j) {
        //Collections.swap(l, i ,j);
        Object x = l.get(i);
        l.set(i, l.get(j));
        l.set(j, x);
    }

    public static void sort(List<Integer> l) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = i; j < l.size(); j++) {
                if (l.get(j) < l.get(i)) {
                    swap(l, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            list.add((int)(Math.random()*9+1));
        }


        sort(list);

        for (int l: list) {
            System.out.println(l);
        }


    }
}
