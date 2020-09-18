package com.company.lecture4;

import java.io.FileWriter;
import java.util.Scanner;


// Javadoc:
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/FileWriter.html

public class WriteFile {
    public static void main(String[] args) {
        try {
            // Skapa ett särskilt objekt för att skriva till en fil
            FileWriter fw = new FileWriter("txtfiler\\fil1.txt", true);

            // Skriv en String till filen

            // Stäng filen

            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
