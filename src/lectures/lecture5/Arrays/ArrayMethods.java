package lectures.lecture5.Arrays;

public class ArrayMethods {
    /*
    Övningar:

    1: Skriv en metod "summa". Metoden ska ta in en array med heltal, och returnera summan av talen.

    2: Skriv en metod "maximum". Metoden ska ta in en array med heltal, och returnera det största talet.
    */

    public static void main(String[] args) {
        int[] numbers = {10, 20, 7, 14, 3};

        // Använd dessa rader för att använda dina metoder

        int sum = summa(numbers);
        int max = maximum(numbers);

        System.out.println("Summan är: " + sum); // Ska skriva ut 54
        System.out.println("Största talet är: " + max); // Ska skriva ut 20
    }

    // Skriv dina metoder här här

    public static int summa(int[] minLista) {
        int result=0;

        for (int j : minLista) {
            result += j;
        }

        return result;
    }

    public static int maximum(int[] minLista) {
        int max = Integer.MIN_VALUE;

        for (int i=0; i< minLista.length; i++) {
            if (minLista[i] >= max) {
                max = minLista[i];
            }
        }

        return max;
    }
}