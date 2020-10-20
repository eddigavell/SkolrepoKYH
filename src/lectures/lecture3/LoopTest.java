package lectures.lecture3;

import java.util.Scanner;

public class LoopTest {
    /* 1: Läs input från användaren.
       2: Skriv ut vad användaren skrev
       3: Om input är "exit", avsluta
       4: Annars: Loopa

       Relevant JavaDoc:
       Scanner: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
       String: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
     */


    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run) {
            System.out.print("Skriv en input: ");
            input = sc.nextLine();
            System.out.println("Du skrev: " + input);
            if (input.equals("exit")) { run = false;}

            /*
            if (input.equals("exit")) {
                run = false;
            } else {
                System.out.println("Du skrev: " + input);
                System.out.println("Skriv 'exit' om du vill avsluta.");
            }
            */
        }
    }
}
