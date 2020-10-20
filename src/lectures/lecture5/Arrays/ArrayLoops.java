package lectures.lecture5.Arrays;

public class ArrayLoops {
        /*
    Övning 1:
    - Skapa en ny array "cars" med värdena:
      "Ford", "Audi", "Skoda", "Volvo", "Chevrolet"
    - Gör en for-loop skriv ut alla värden på skärmen.
      "Place 0: Ford"
      "Place 1: Audi"
      "Place 2: Skoda"
      "Place 3: Volvo"
      "Place 4: Chevrolet"

    Övning 2:
    - Utan att tidigare kod: Lägg till en rad kod som ändrar "Audi" till "Nissan" i listan.
    - Skriv ut alla elementen i arrayen baklänges, från det sista till det första
     */

    public static void main(String[] args) {
        // Skriv din kod här
        String[] cars = {"Ford", "Audi", "Skoda", "Volvo", "Chevrolet"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Place " + i + ": " + cars[i]);
        }

        cars[1] = "Nissan";
        System.out.println();

        for (int i = cars.length-1; i>=0; i--) {
            System.out.println(("Place " + i + ": " + cars[i]));
        }
    }
}
