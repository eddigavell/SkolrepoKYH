package Labs.LabWeek2;

import java.io.*;
import java.util.*;
import java.nio.file.*;


public class LabbWeek2 {

    public static String pathToCurrentFolder(String Path) {
        Path currentRelativePath = Paths.get("");
        return currentRelativePath.toAbsolutePath().toString();
    }

    public static void searchThroughDirectoryAndSubdirectories(String directoryName, String targetString) {
        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        assert fList != null;
        for (File file : fList) {
            if (file.isFile()) {
                readFilesInFolder(file.getAbsolutePath(), targetString);
            } else if (file.isDirectory()) {
                searchThroughDirectoryAndSubdirectories(file.getAbsolutePath(), targetString);
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

    public static void readFilesInFolder(String filename, String targetString) {
        File file = new File(filename);

        if (file.exists()) {
            try {
                Scanner sc = new Scanner(file);
                String s;
                while (sc.hasNextLine()) {
                    s = sc.nextLine();
                    if (s.equals(targetString)){
                        System.out.println(file.getName() + " " + file.getCanonicalPath());
                    }
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("An error occured during reading file...");
            }

        }
    }

    public static void main(String[] args) {
        //Ställa oss i rätt mapp. Börja räkna hur många filer som finns i mappen och undermappar.
        // Börja läsa igenom fil för fil efter en text sträng och om den finns så skriva ut filepath.

        Scanner sc = new Scanner(System.in);

        //Tar fram vilken nuvarande mapp är
        System.out.println("Du befinner dig i mapp: " + pathToCurrentFolder(""));
        System.out.println();

        System.out.println("I denna mapp så finns dessa mappar: ");
        listDirectories(pathToCurrentFolder(""));

        System.out.println();
        System.out.print("Vilken mapp vill du söka i? (Vill du söka igenom alla så skriv '.'): ");
        String targetDirectory = sc.next();



        System.out.print("Skriv in ett sökord: ");
        String targetString = sc.next();




        System.out.println(".....................");
        System.out.println("Du vill söka igenom mapp '" + targetDirectory + "' och med sökordet '" + targetString + "'");

        System.out.println();
        searchThroughDirectoryAndSubdirectories(targetDirectory, targetString);
    }

}
