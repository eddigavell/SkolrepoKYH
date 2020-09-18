package com.company.LabWeek2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileCrawlerEdvin {

    public static void printInfo(File file, String searchWord) {
        //om det är en vanlig fil: skriv ut namnet på filen.
        //Om det är en mapp: skriv ut namnet på mappen, ochgå in i mappen.
        if (file.isFile()) {
        //System.out.println("Fil: " + file.getName());
        } else if (file.isDirectory()) {
            try {
                //System.out.println("Mapp" + file.getCanonicalPath());
                File[] folderContents = file.listFiles();
                for (int i = 0; i < folderContents.length; i++) {
                    File f = folderContents[i];
                    readFromFile(f, searchWord);
                    printInfo(f, searchWord);
                }

                // for (File f: file.listFiles()) {
                //    printInfo(f);
                // }
            } catch (Exception e) {
                System.out.println("Oops");
            }
        }
    }

    public static void readFromFile(File targetFile, String searchWord) {
        // Skapa ett File-object, som styr vilken fil vi vill läsa
        //File file = new File("C:\\Users\\eddi\\Documents\\Programmering\\KYH\\SkolrepoKYH\\txtfiler\\CJL.txt");
        File file = new File(String.valueOf(targetFile));
        if (file.exists() && file.isFile()) {
            try {
                // Använd scanner för att läsa filen
                Scanner sc = new Scanner(file);
                String s;
                // Skriv ut filen, rad för rad
                // Så länge scannern har en nästa rad:
                // Läs raden från scannern, skriv ut på skärmen
                while(sc.hasNextLine()) {
                    s = sc.nextLine();
                    if (s.equals(searchWord)) {
                        System.out.println(file.getName() + " " +file.getCanonicalPath());
                    }
                }
                // Stäng filen
                sc.close();

            } catch (Exception e) {
                System.out.println("An error occurred.");
            }
        }

    }
    public static void main(String[] args) {
        try {
            File startingFolder = new File("txtfiler/");

            System.out.println("Starting Path: " + startingFolder.getCanonicalPath());
            System.out.println("Contains: " + Arrays.toString(startingFolder.list()));
            System.out.println("....");
            System.out.println();
            String sokOrd = "Vatten";
            System.out.println("Ditt sökord är: " + sokOrd);

            printInfo(startingFolder, sokOrd);
        } catch (Exception e) {
            System.out.println("Oops");
        }
    }
}
