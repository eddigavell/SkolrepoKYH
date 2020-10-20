package lectures.lecture3;

public class Hamlet {
    /* Relevant Javadoc:
       https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
     */

    public static void main(String[] args) {
        String hamletQuote = "Something is rotten in the state of Denmark";

        // Med hjälp av JavaDoc, använd olika metoder för att skriva ut texten i
        // 1: gemener (lowercase)
        // 2: VERSALER (UPPERCASE)

        System.out.println(hamletQuote.toLowerCase());
        System.out.println(hamletQuote.toUpperCase());
    }
}
