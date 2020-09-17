package com.company;
import java.util.*;

public class RepeatWithErrors {
    /* Detta program ska be användaren att skriva in en text, sedan skriva ut det på skärmen flera gånger.
       Exempel:
         Write something: Hejsan
         Number of times to repeat: 4

         HejsanHejsanHejsanHejsan

       Uppgifter:
       1) Skriv ett program som fungerar som exemplet ovan.
          (Kolla i JavaDoc för String, det kanske finns en metod för att repetera text?)
       2) Vad händer när du matar in ett negativt tal?
          Skriv kod som hanterar när något går fel. Om användaren skriver ett ogiltigt tal ska programmet skriva ut
          ett felmeddelande och avslutas.

          Exempel:
            Write something: Hejsan
            Number of times to repeat: -4

            Error, cannot understand that number

       Relevant JavaDoc:
       Scanner: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
       String: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Write something: ");
            String input = sc.next();
            System.out.print("Number of times to repeat?: ");
            int nRepeat = sc.nextInt();

            System.out.print(input.repeat(nRepeat));
        } catch (Exception e) {
            System.out.println("Error, cannot understand that number");
        }

        // Gör en scanner
        // Be användaren om input (två gånger)
        // Repetera texten flera gånger.
    }
}
