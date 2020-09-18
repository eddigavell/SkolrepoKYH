package com.company.lecture4;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileTree {

    public static void printInfo(File file) {
        //om det är en vanlig fil: skriv ut namnet på filen.
        //Om det är en mapp: skriv ut namnet på mappen, ochgå in i mappen.
        if (file.isFile()) {
            System.out.println("Fil: " + file.getName());
        } else if (file.isDirectory()) {
            try {
                System.out.println("Mapp" + file.getCanonicalPath());
                File[] folderContents = file.listFiles();
                for (int i = 0; i < folderContents.length; i++) {
                    File f = folderContents[i];
                    printInfo(f);
                }

                // for (File f: file.listFiles()) {
                //    printInfo(f);
                // }
            } catch (Exception e) {
                System.out.println("Oops");
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

        printInfo(startingFolder);
        } catch (Exception e) {
            System.out.println("Oops");
        }
    }
}
