package lectures.lecture4;

import java.util.*;
import java.io.File;
/*

 */

public class readFileandPrintToSystemOut {

    public static void main(String[] args) {

        //Vart ligger filen?
        File file = new File("txtfiler\\CJL.txt");
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
