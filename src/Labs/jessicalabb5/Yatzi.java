package jessicalabb5;

import java.util.Arrays;
import java.util.Scanner;

public class Yatzi {
    public static Die[] dice;
    public static int turn = 0;
    public static boolean startGame = true;

    private static boolean isYatzi(Die[] dice) {
        for (int y = 1; y < 5; y++) {
            if (dice[y].value != dice[y - 1].value) {
                return false; // lagt till en break
            }
        }
        return true;
    }


    private static void listDice() {  //listar upp 5 tärningar, startar spelet
        dice = new Die[5];
        for (int d = 0; d < 5; d++) {
            dice[d] = new Die();
        }
    }

    public static void startGame() {
        System.out.println("Welcome to YATZI!");
        while (turn < 3) {
            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < dice.length; i++) {
                dice[i].DieRoll();
                //dice[i].value = 5; //Test if yatzi work
                System.out.println(i + ": " + dice[i].getString());
            }

            if (isYatzi(dice)) {
                System.out.println("You got YATZI! in " + dice[0].value + "'s");
                return;
            } else if (turn != 2) { //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    ++turn;

                } else {
                    startGame = !startGame;
                    break;
                }
            } else {
                System.out.println("Game over! Want to play again?");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    turn = 0;
                } else {
                    startGame = !startGame;
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        listDice();
        startGame();


    }
}
