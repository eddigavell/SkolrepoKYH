package lectures.lecture3;
import java.util.*;

public class GissaTal {


    public static void main(String[] args) {
        int answer = 13;
        Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Gissa ett tal: ");
        while(sc.hasNext()) {
            int guessedNumber = sc.nextInt();
            if(guessedNumber < answer) {
                System.out.println("Din gissning är för liten, gissa högre");
            } else if (guessedNumber > answer) {
                System.out.println("Din gissning är för stor, prova mindre");
            } else {
                System.out.println("Grattis! Du gissade rätt");
                break;
            }
        }


    }
}
