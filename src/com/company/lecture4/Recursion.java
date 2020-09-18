package com.company.lecture4;

public class Recursion {
    /* Instruktioner
    helloRec: Denna funktion tar in ett heltal "i".

        Instruktioner:

        1: Om heltalet är 0 ska vi avsluta (Använd return) ("Basfall").

        Annars:
        2: Skriv ut "Hello " + i.
        3: Anropa helloRec igen, men minska i med 1.


    1: När ska vi stanna? ("Basfall")
    2: Skriv ut: Hello i
    3: Anropa sig själv
    */

    public static void helloRec(int i){
        if (i != 0){
            System.out.println("hello " +i);
            helloRec(i-1);
        }

        /*  ----Annan typ av if sats men samma resultat-----
            if (i == 0) {
                return;
            } else {
                System.out.println("hello " + i);
                helloRec(i-1);
            }
        */
    }

    public static void main(String[] args) {
        // Starta med att anropa funktionen
        helloRec(50);
    }
}