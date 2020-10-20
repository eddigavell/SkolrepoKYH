package Lecture12;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Streams {

    public static int adder(int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        //Adderar saker till listan
        strList.add("a1");
        strList.add("a2");
        strList.add("b1");
        strList.add("b2");
        strList.add("c1");
        strList.add("c2");

        System.out.println("Skriver ut i en foreach-loop");
        for (String element: strList) {
            System.out.println(element);
        }

        System.out.println("\nSkriver ut med en stream");
        strList
                .stream() //Gör om till en stream
                .forEach(System.out::println); //Skriver ut elementen

        // ----------------------------------------------------------
        // Filter

        System.out.println("\nAlla element som börjar på c");
        strList
                .stream() //Skapat en ström
                .filter(str -> str.startsWith("c")) //Hitta alla element som börjar på c
                .forEach(System.out::println); //Skriver ut elementen

        System.out.println("\nAlla element som slutar på 2");
        strList
                .stream() //Skapat en ström
                .filter(str -> str.endsWith("2")) //Hitta alla element som slutar på 2
                .forEach(System.out::println); //Skriver ut elementen

        // ----------------------------------------------------------
        // Sorts

        System.out.println("\nSortera");
        strList
                .stream() //Skapat en ström
                .sorted() //Sorterar listan
                .forEach(System.out::println); //Skriver ut elementen

        // ----------------------------------------------------------
        // Map

        System.out.println("\nGör alla strängar till versaler");

        strList
                .stream() //Skapat en ström
                .map(String::toUpperCase) //Gör alla element till versaler
                .forEach(System.out::println); //Skriver ut det

        // ----------------------------------------------------------
        // Ny lista med heltal

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println("\nAlla heltal större eller lika med 3");
        intList
                .stream()
                .filter(i -> i>=3 )
                .forEach(System.out::println);

        // ----------------------------------------------------------
        // Map forts.

        System.out.println("\nMap-exempel");
        intList
                .stream()
                .mapToDouble(i -> i*2) //Gör en Double utav mapen och gångrar alla tal med 2.
                .forEach(System.out::println);

        // ----------------------------------------------------------
        // Reduce

        System.out.println("\nReduce: Summera en lista");
        intList
                .stream()
                .forEach(System.out::println);

        int sum = intList.stream().reduce(0, (a, b) -> a+b ); //Lambda
        int sum1 = intList.stream().reduce(0, Integer::sum); //Inbyggd funktion i integer
        int sum2 = intList.stream().reduce(0, Streams::adder); //Egen funktion

        System.out.println("Summan är: " + sum + ", " + sum1 + ", " + sum2);

        // ----------------------------------------------------------
        // Seriellt vs parallellt
/*
        System.out.println("\nSeriellt vs Parallellt");

        System.out.println("\nStartar seriellt");
        long startTime = System.currentTimeMillis(); //Hämtar vad klockan är vid startpunkt i ms
        intList
                .stream() //Seriell stream på en kärna
                .map(Streams::waitQuad)
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis(); //Hämtar klockan efter koden är körd.
        System.out.println("Det tog: " + (endTime-startTime) + "ms");

        System.out.println("\nStartar parallellt");
        long startTime1 = System.currentTimeMillis(); //Hämtar vad klockan är vid startpunkt i ms
        intList
                .parallelStream() //Parallel stream på flera kärnor
                .map(Streams::waitQuad)
                .forEach(System.out::println);
        long endTime1 = System.currentTimeMillis(); //Hämtar klockan efter koden är körd.
        System.out.println("Det tog: " + (endTime1-startTime1) + "ms");

 */
        // ----------------------------------------------------------
        // Map-Reduce
        System.out.println("\nMap-reduce sum");
        int mapReduceSum = intList
                                .parallelStream()
                                .map(i -> i*i) //Map först
                                .reduce(0, Integer::sum); //Sen reducear vi
        System.out.println("Summan är: " + mapReduceSum);

    }

    static int waitQuad(int a) {
        //Väntar 1 sekund, sedan räknar ut kvadraten av talet a
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a*a;
    }
}