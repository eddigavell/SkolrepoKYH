package kyh.exercises.lecture4;

import java.io.File;
import java.util.Arrays;

// Ett färdigt exempel, ingen särskild övning att skriva

public class ListFilesInDir {
    public static void main(String[] args) {
        // Vilken katalog vill vi kolla i?
        File dir = new File("C:/temp/java");

        // Om det är en katalog, skriv ut filernas namn
        if (dir.isDirectory()) {
            // Hämta katalogens innehåll
            String[] listing = dir.list();

            // Gör om till en sträng (vi förklarar senare i kursen)
            String strList = Arrays.toString(listing);

            // Skriv ut listan
            System.out.println("Directory, contains: " + strList);
        } else {
            System.out.println("Doesn't exist, or isn't a directory");
        }
    }
}

