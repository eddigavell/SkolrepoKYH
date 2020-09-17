package com.company;

import java.io.*;
import java.util.*;
import java.nio.file.*;


public class LabbWeek2 {


    public static void searchThroughDirectoryAndSubdirectories(String directoryName) {
        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        assert fList != null;
        for (File file : fList) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                searchThroughDirectoryAndSubdirectories(file.getAbsolutePath());
            }
        }
    }

    public static void listDirectories(String directoryName){
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();

        assert fList != null;
        for(File file : fList) {
            if (file.isDirectory()) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        //Ställa oss i rätt mapp. Börja räkna hur många filer som finns i mappen och undermappar.
        // Börja läsa igenom fil för fil efter en text sträng och om den finns så skriva ut filepath.

        Scanner sc = new Scanner(System.in);

        //Tar fram vilken nuvarande mapp är
        Path currentRelativePath = Paths.get("");
        String nuVarandeMapp = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Du befinner dig i mapp: " + nuVarandeMapp);
        System.out.println();

        System.out.println("I denna mapp så finns dessa mappar: ");
        listDirectories(nuVarandeMapp);

        System.out.println();
        System.out.print("Vilken mapp vill du söka i? (Vill du söka igenom alla så skriv '.'): ");
        String targetDirectory = sc.next();



        System.out.print("Skriv in ett sökord: ");
        String targetWord = sc.next();




        System.out.println(".....................");
        System.out.println("Du vill söka igenom");
        System.out.println("Mapp: " + targetDirectory);
        System.out.println("Sökordet: " + targetWord);

        System.out.println();
        System.out.println("Dessa filer finns i denna mapp just nu: ");
        searchThroughDirectoryAndSubdirectories(targetDirectory);

    }

}
