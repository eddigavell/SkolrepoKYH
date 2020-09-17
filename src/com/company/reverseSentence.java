package com.company;
import java.util.*;

public class reverseSentence {

    public static String printEveryOtherWord(String s) {
        String resultVartAnnatOrd = "";
        int wordCount=1;

        Scanner sc = new Scanner(s);

        while(sc.hasNext()) {
            /*if (wordCount % 2 == 0) {
                resultVartAnnatOrd = resultVartAnnatOrd + " " + sc.next();
            } else {
                sc.next();
            }
            wordCount++;
            */
            resultVartAnnatOrd = resultVartAnnatOrd + " " + sc.next();
            if(sc.hasNext()) {
                sc.next();
            }
        }

        return resultVartAnnatOrd;
    }

    public static String reverseSentence(String s) {
        String result = "";
        Scanner sc = new Scanner(s);
        while(sc.hasNext()) {
            result = sc.next() + " " + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String quote = "Stan är full av tanter och tragik";
        //System.out.println(reverseSentence(quote));

        //System.out.println("========================");
        System.out.println(quote);
        System.out.println(printEveryOtherWord(quote));
    }
}
