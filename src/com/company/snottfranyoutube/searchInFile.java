package com.company.snottfranyoutube;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

/*
    Hämtat från youtube. https://www.youtube.com/watch?v=QUn2YxAM4oA

    Simplecode - Java Search in text file

 */

public class searchInFile {

    public static void main(String[] args) throws IOException {
        //we need path to our games.txt
        Path path = Paths.get("txtfiler/Djur.txt").toAbsolutePath();
        //Now let's fill our arraylist
        List<String> titles = Files.lines(path).collect(Collectors.toList());

        String searchGame = getInput(); //getInput is a method we'll create.

        //display result
        displayResults(searchGame, titles);

    }

    //User input method
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter game's title: ");
        String titleName = sc.nextLine();

        return titleName;
    }

    //Display result
    public static void displayResults(String searchName, List<String> titles) throws IOException {
        boolean inFile = titles.stream().anyMatch(p->p.equalsIgnoreCase(searchName));

        if (inFile) {
            System.out.println("\nYes, " + searchName + " is IN this file!");
        } else {
            System.out.println("\nNo, " + searchName + " is NOT this file!");
        }
    }
}
