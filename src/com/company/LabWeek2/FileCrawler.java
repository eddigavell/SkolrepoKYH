package com.company.LabWeek2;

import com.company.Lecture7.NotHelloException;

import java.io.File;
import java.util.Scanner;

public class FileCrawler {

    public static void stepThroughFileAndSearch(File startFolder, String searchWord) throws NotHelloException {
        if (searchWord.equals("Hello")) {
            throw new NotHelloException("This is an error.");
        } else {
            if (startFolder.isDirectory()){
                File[] folderContents = startFolder.listFiles();
                assert folderContents != null;
                for (File f : folderContents) {
                    stepThroughFileAndSearch(f, searchWord);
                }
            } else if (startFolder.isFile()){
                try {
                    Scanner sc = new Scanner(startFolder);
                    String s;
                    while(sc.hasNextLine()) {
                        s = sc.nextLine();
                        if (s.contains(searchWord)){
                            System.out.println(startFolder.getName() + " " + startFolder.getAbsolutePath());
                        }
                    }
                    sc.close();
                } catch (Exception e) {
                    System.err.println("Couldn't read " + startFolder.getName() + " in " + startFolder.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) throws NotHelloException {
        Scanner sc = new Scanner(System.in);

        File startingFolder = new File("src/txtfiler/");
        System.out.println("-------Program FileCrawler-------");
        System.out.print("Vad vill du söka efter? ");
        String sokOrd = sc.next();

        System.out.println("Du söker efter: " + sokOrd + " \ni mapp: " + startingFolder);
        System.out.println();

        try {
            stepThroughFileAndSearch(startingFolder, sokOrd);
        } catch (NotHelloException e) {
            System.err.println(e.getMessage());
        }
    }
}
