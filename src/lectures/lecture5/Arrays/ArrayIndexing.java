package lectures.lecture5.Arrays;

public class ArrayIndexing {
        /*
    Övningar:
    - Skriv ut det första talet i arrayen
    - Skriv ut det sista talet i arrayen
    - Ändra talet "123.321" till "8.8", utan att ändra på raden där arrayen skapas
    - Skriv ut det sista talet i arrayen igen
     */

    public static void main(String[] args) {
        double[] minLista = {5.6, 4.0, 99.22, 3.3, 34.0, 0.01, 3.1415, 9.001, 13.13, 123.321};

        // Skriv din kod här

        for (int i = 0; i < minLista.length; i++) {
            System.out.print(minLista[i] + " ");
        }

        System.out.println("Arrayen innehåller: " + minLista.length + " nummer.");
        System.out.println(minLista[0]);
        System.out.println(minLista[9]);
        minLista[9] = 8.8;
        System.out.println(minLista[9]);

    }
}
