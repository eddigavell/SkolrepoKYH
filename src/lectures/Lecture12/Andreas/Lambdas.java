package lectures.Lecture12.Andreas;

public class Lambdas {
    public static void runMethod(Hello lambdaFunc) {
        lambdaFunc.sayHello();
    }

    public static Lecture12.Andreas.LambdaInterfaces.MyLambda getFunc() {
        Lecture12.Andreas.LambdaInterfaces.MyLambda safeDivideFunction = (a, b) -> {
            if (b == 0) return 0;
            return a / b;
        };

        return safeDivideFunction;
    }

    public static void main(String[] args) {
        // Gör en Hello World på några olika sätt
        Hello helloVar = () -> System.out.println("Hello!");

        helloVar.sayHello();

        runMethod(helloVar);

        runMethod(() -> System.out.println("Hello Lambda!"));

        // -------------------------------------

        MyQuad quadFunction = a -> a*a;

        /*
        () -> System.out.println("Hej");  // Inga argument
        a -> a*a;  // Ett argument
        (a, b) -> a*b;  // Två argument
        */

        Lecture12.Andreas.LambdaInterfaces.MyLambda addFunction = (a, b) -> a + b;

        Lecture12.Andreas.LambdaInterfaces.MyLambda aFunction = getFunc();
        aFunction.func(2, 2);

        // variabler funkar precis som vanligt, kan kopiera till andra variabler
        Lecture12.Andreas.LambdaInterfaces.MyLambda funcA = aFunction;
        Lecture12.Andreas.LambdaInterfaces.MyLambda funcB = funcA;
        Lecture12.Andreas.LambdaInterfaces.MyLambda funcC = funcB;
        funcC.func(1, 1);

        // Gör en metod som kör string length
        MyStr strLenFunction = s -> s.length();

        System.out.println(quadFunction.quad(4));
        System.out.println(quadFunction.quad(8));

        System.out.println(addFunction.func(3, 7));

        System.out.println(aFunction.func(8, 2));
        System.out.println(aFunction.func(8, 0));

        System.out.println(strLenFunction.strLen("Hello Lambda!"));

    }

    @FunctionalInterface
    interface MyStr {
        int strLen(String x);
    }

    @FunctionalInterface
    interface Hello {
        void sayHello();
    }

    @FunctionalInterface
    interface MyQuad {
        int quad(int a);
    }
}
