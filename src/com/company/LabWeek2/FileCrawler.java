package com.company.LabWeek2;

import java.io.File;
import java.util.Scanner;

public class FileCrawler {



    public static void stepThroughFileAndSearch(File startFolder, String searchWord){
        if (startFolder.isDirectory()){
            File[] folderContents = startFolder.listFiles();
            assert folderContents != null;
            for (File f : folderContents) {
                stepThroughFileAndSearch(f, searchWord);
            }
        } else if (startFolder.isFile()){

            try {
                // Använd scanner för att läsa filen
                Scanner sc = new Scanner(startFolder);
                String s;

                // Skriv ut filen, rad för rad
                // Så länge scannern har en nästa rad:
                // Läs raden från scannern, skriv ut på skärmen
                while(sc.hasNextLine()) {
                    s = sc.nextLine();
                    if (s.equals(searchWord)){
                        System.out.println(startFolder.getName() + " " + startFolder.getCanonicalPath());
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
        Scanner sc = new Scanner(System.in);
        File startingFolder = new File("txtfiler/");

        System.out.print("Vad vill du söka efter? ");
        String sokOrd = sc.next();
        System.out.println("Du söker efter: " + sokOrd + " \ni mapp: " + startingFolder);
        System.out.println();

        stepThroughFileAndSearch(startingFolder, sokOrd);










    }
}
