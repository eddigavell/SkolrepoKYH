package com.company;

import java.io.File;

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

    public static void main(String[] args) {
        // Något att starta från

        // Ange vilken fil vi vill jobba med
        File f = new File("C:\\path\\to\\file.txt");
        // C:\Users\eddi\IdeaProjects\Programmingexercises\txtfiler\fil1.txt

        // Skriv ut information om filen
        System.out.println("Existerar filen? " + f.exists());
    }
}
