package com.company;

import java.util.*;
import java.io.File;
import java.nio.file.*;
/*

 */

public class readFileandPrintToSystemOut {

    public static void main(String[] args) {


        //Tar fram vilken nuvarande mapp är
        Path currentRelativePath = Paths.get("");
        String nuVarandeMapp = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Du befinner dig i mapp: " + nuVarandeMapp);
        System.out.println();


        //Vart ligger filen?
        // C:\Users\eddi\Documents\Programmering\KYH\SkolrepoKYH\txtfiler\CJL.txt
        // File file = new File("//txtfiler//CJL.txt");
        File file = new File("C:\\Users\\eddi\\Documents\\Programmering\\KYH\\SkolrepoKYH\\txtfiler\\CJL.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(file.exists());
    }

}
