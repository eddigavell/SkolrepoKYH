package com.company.lecture4;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile {




    public static void main(String[] args){

        File fromFile = new File("txtfiler/test.txt");
        File toFile = new File("txtfiler/copytest.txt");
        if (fromFile.exists()){
            try {
                Scanner sc  = new Scanner(fromFile);
                FileWriter fw = new FileWriter(toFile);
                while (sc.hasNextLine()){

                    fw.write(sc.nextLine() + "\n");

                }
                fw.close();
                System.out.println("Filen är skapad.");
            } catch (Exception e){
                System.out.println("could not read file!");
            }
        } else {
            System.out.println("File does not exist!");
        }

    }


}
