package com.company.lecture4;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class WriteToNewFile {

    public static void printFile(String nameOfFile, String content) {
        File file = new File("txtfiler/" + nameOfFile + ".txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.close();
            System.out.println("Filen är skapad.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String Path) {
        File file = new File("txtfiler/" + Path + ".txt");
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
            System.out.println("Går inte att läsa filen.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Skapa en ny fil-----");
        System.out.print("Vad vill du att filen skall heta? ");
        String filename = sc.nextLine();

        System.out.println();
        System.out.println("Vilket innehåll skall den ha?");
        String fileContent = sc.nextLine();

        printFile(filename,fileContent);

        readFile(filename);
    }
}
