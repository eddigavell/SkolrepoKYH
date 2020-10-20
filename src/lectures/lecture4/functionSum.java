package lectures.lecture4;

public class functionSum {

    public static int sum(int i) {

        if( i == 0) {
            return 0;
        } else {
           return sum(i-1) + i;
        }

    }

    public static void main(String[] args) {

        //Rekursion att kalla på en funktion att anropa sig själv.

        System.out.println(sum(4));
    }
}
