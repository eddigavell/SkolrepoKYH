package com.company;

import java.util.*;
import java.io.*;

/*
    Hämtat från youtube: https://www.youtube.com/watch?v=Qb5PEmE0eEg

    ZappyNet Tutorial - Search a record from text file in java
 */

public class FileOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SID for searching: ");
        String sid =sc.nextLine();
        String line;

        try {
            FileInputStream fin=new FileInputStream("C:\\Users\\eddi\\Documents\\Programmering\\KYH\\SkolrepoKYH\\txtfiler\\Djur.txt");
            Scanner scan=new Scanner(fin);

            while (scan.hasNextLine()) {
                line=scan.nextLine();
                if(line.startsWith(sid)) {
                    System.out.println(line);
                }
                scan.close();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
