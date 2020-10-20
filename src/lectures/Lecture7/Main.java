package lectures.Lecture7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/txtfiler/Lab4.txt"));
        while (sc.hasNext()) {
            int xa = sc.nextInt();
            if (xa < 1) {
                throw new IllegalArgumentException();
            } else {
                for (int i = 0; i < xa; i++) {
                    System.out.println("Hello");
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
    /*
        Shape rect = new Rectangle(5, 6);
        System.out.println("-Rektangel-");
        System.out.println("A: " + rect.getArea());
        System.out.println("O " + rect.getCircumference());


        System.out.println();
        Shape triangle = new Triangle(5, 6, 7);
        System.out.println("-Triangel-");
        System.out.println("A: " + triangle.getArea());
        System.out.println("O: " + triangle.getCircumference());

        System.out.println();
        Shape circle = new Circle(5);
        System.out.println("-Circle-");
        System.out.println("A: " + circle.getArea());
        System.out.println("O: " + circle.getCircumference());
    */
        //double d = 3.3+3.3+3.3;
        //System.out.println(Math.ceil(d));
        //System.out.println("pi: " + Math.PI);


        //System.out.println(Math.max(5,9));
        //System.out.println();
        //System.out.println(Math.random());
        //System.out.println(Math.random());
        //System.out.println(Math.random());
        //System.out.println(Math.random()*5 + 1); //Math.random() * högsta talet vi vill ha, + lägsta

        //long diceRoll = Math.round(Math.random()*5 + 1); //avrundning till närmaste heltal.
        //System.out.println(diceRoll);

        // slumpad triangle, rätvinklig
        // slumpad rektangel.
    /*
    long a = Math.round(Math.random()*5 + 1);
    long b = Math.round(Math.random()*5 + 1);
    long c = Math.round(Math.random()*5 + 1);

    int x = Math.toIntExact(a);
    int y = Math.toIntExact(b);
    int z = Math.toIntExact(c);


    Shape tri = new Triangle(x,y,z);
    System.out.println("-Triangel-");
    System.out.println("A: " + tri.getArea());
    System.out.println("O: " + tri.getCircumference());
    System.out.println();

    Shape rect = new Rectangle(x,y);
    System.out.println("-Rektangel-");
    System.out.println("A: " + rect.getArea());
    System.out.println("O: " + rect.getCircumference());
    System.out.println();

    System.out.println();

    */
        try {
            readFile();
        } catch (IllegalArgumentException e) {
            System.err.println("Input a number larger than 0");
        } catch (FileNotFoundException e) {
            System.out.println("Could not read file");
        } catch (Exception e) {
            System.err.println("Something else went wrong");
        } finally {
            System.out.println("done.");
        }
    }
}