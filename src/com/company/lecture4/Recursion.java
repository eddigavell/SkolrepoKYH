package com.company.lecture4;

public class Recursion {

    public static void helloRec(int i){
        /*
        helloRec: Denna funktion tar in ett heltal "i".

        Instruktioner:
         */


        if (i == 0) {
            //1: Om heltalet är 0 ska vi avsluta (Använd return) ("Basfall").
            return;
        } else {
        //Annars:
        //2: Skriv ut "Hello " + i.
        System.out.println("Hello " + i);
        //3: Anropa helloRec igen, men minska i med 1.
        helloRec(i-1);
            // När ska vi stanna? ("Basfall") --> Kmr åka ur tack vare if i==0.
        }
    }


    public static void main(String[] args) {
        // Starta med att anropa funktionen
        helloRec(5);
    }
}