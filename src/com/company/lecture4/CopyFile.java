package com.company.lecture4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {




    public static void main(String[] args) throws IOException {

        File fromFile = new File("txtfiler/test.txt");
        FileWriter toFile = new FileWriter("txtfiler/copytest.txt");
        if (fromFile.exists()){
            try {
                Scanner sc  = new Scanner(fromFile);
                String s;
                while (sc.hasNextLine()){
                    s = sc.nextLine();
                    System.out.println(s);
                    toFile.write(s+ "\n");
                }
                toFile.close();
                System.out.println("Filen är skapad.");
            } catch (Exception e){
                System.out.println("could not read file!");
            }
        } else {
            System.out.println("File does not exist!");
        }

    }


}
