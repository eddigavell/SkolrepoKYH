package com.company.lecture4;

import java.io.File;
import java.util.Scanner;

// Javadoc:
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/File.html
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html

/*
   Förberedelse: Skapa en ny textfil, och skriv några rader text i den
   Alt 1: Lägg den var som helst på hårddisken, och skriv hela sökvägen till filen i koden nedan
   Alt 2: Lägg filen i mappen "programmingexercises" och använd bara filnamnet i koden nedan
 */

public class ReadFile {
    public static void main(String[] args) {
        // Skapa ett File-object, som styr vilken fil vi vill läsa
        //File file = new File("C:\\Users\\eddi\\Documents\\Programmering\\KYH\\SkolrepoKYH\\txtfiler\\CJL.txt");
        File file = new File("txtfiler\\CJL.txt");
        System.out.println(file.exists());

        try {
            // Använd scanner för att läsa filen
            Scanner sc = new Scanner(file);

            // Skriv ut filen, rad för rad
            // Så länge scannern har en nästa rad:
            // Läs raden från scannern, skriv ut på skärmen
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            // Stäng filen
            sc.close();

        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
