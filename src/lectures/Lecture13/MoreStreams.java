package lectures.Lecture13;

import java.util.Arrays;
import java.util.List;

public class MoreStreams {

    public static int add(int a, int b) {
        return a+b;
    }

    interface MyAdd {
        int func(int x, int y);
    }

    public static void main(String[] args) {
        /*    Lambda uttryck                  */
        MyAdd addFunc = (a,b) -> {
            return a+b;
        };

        int summa = addFunc.func(8,21);

        System.out.println("Summan är: " + summa);

        /*    Streams                 */

        List<String> letters = Arrays.asList("a", "b", "c", "d","e");


    }
}
