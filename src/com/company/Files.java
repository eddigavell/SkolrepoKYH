package com.company;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class Files {
    /*

    Instruktioner:

    1: Skapa en text-fil någonstans på din hårddisk
       Ex: C:\temp\java\fil1.txt


    2: För en enstaka fil:
       Baserat på vad filens sökväg är, skriv ut följande information om en av filerna:
       - Är sökvägen en fil?
       - Finns filen?
       - Vad är filnamnet?
       - Kan programmet läsa från filen?

       Tips:
       - Kolla på JavaDoc för information:
         https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/File.html
       - Sökvägar måste använda / eller \\ för att separera mappar och filer. Ett enkelt \ fungerar inte.
         Ex: C:\temp\java\fil1.txt blir "C:\\temp\\java\\fil1.txt"

     3: Skapa två till nya filer. Ex: C:\temp\java\fil2.txt, C:\temp\java\fil3.txt
        Gör en ny metod som tar en sökväg till en fil som en String, och skriver ut allt från steg 2.
        Anropa funktionen med alla tre filerna du skapade i steg 1.

        Ex:

        public static void main(String[] args) {
            printFileInfo("C:/temp/java/fil1.txt");
            printFileInfo("C:/temp/java/fil2.txt");
            printFileInfo("C:/temp/java/fil3.txt");
        }

        private static void printFileInfo(String filePath) {
            // Skriv din kod här
        }
    */
    private static void printFileInfo(String filePath) {
        File file = new File(filePath);
        System.out.println("Filen ligger här: " + file.getAbsolutePath());
        System.out.println("Filen heter: " + file.getName());
        System.out.println("Är en fil?: " + file.isFile());
        System.out.println("Existerar filen?: " + file.exists());
        System.out.println("Kan filen läsas?: " + file.canRead());
        System.out.println();
    }
    private static void skapaNyFil(String filePath, String fileMessage) {
        try {
            File file = new File(filePath);
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());

                //Write Content
                FileWriter writer = new FileWriter(file);
                writer.write(fileMessage);
                writer.close();
            } else {
                System.out.println("File already exists.");

                System.out.println(file);
                System.out.println(fileMessage);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Namn på filen du letar efter?: ");
        String filNamn = sc.nextLine();

        printFileInfo("txtfiler\\" + filNamn + ".txt");
        printFileInfo("txtfiler\\fil2.txt");
        printFileInfo("txtfiler\\fil3.txt");


        //Skapa en ny fil med path, namn, innehåll
        System.out.println("======================");
        System.out.println();
        boolean run = true;
        while (run) {
            System.out.print("Skapa en ny fil? ");
            String JagVillSkapaEnNyFil = sc.nextLine();

            if (JagVillSkapaEnNyFil.equals("ja")) {
                System.out.print("Filnamn?: ");
                String fileName = sc.nextLine();

                System.out.print("Innehåll?: ");
                String fileMessage = sc.nextLine();

                skapaNyFil("txtfiler\\" + fileName, fileMessage);
            } else if (JagVillSkapaEnNyFil.equals("nej")) {
                run = false;
            }
        }


    }
}
