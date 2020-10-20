package Lecture12;

public class Lambdas {
    public static void  runMethod (LambdaInterfaces.Hello lamdaFunc) {
        lamdaFunc.sayHello();
    }

    public static Lecture12.LambdaInterfaces.MyLambda getFunc() {
        LambdaInterfaces.MyLambda safeDivideFunction = (a, b) -> {
            if (b == 0) return 0;
            return a/b;
        };
        return safeDivideFunction;
    }

    //Kommer på tentan tydligen? Ger möjlighet till avancerad kod.

    public static void main(String[] args) {
        //Gör helloworld på några olika sätt
        LambdaInterfaces.Hello helloVar = () -> System.out.println("Hello!");

        helloVar.sayHello();

        runMethod(helloVar);

        runMethod(() ->System.out.println("Hello Lambda!"));

        /*
        ------------------------------------------------------------------------------------------------------

        public int quad(int a) {
            return a*a;
        }
        ----------------------------------
        (int a) -> { return a*a: };
        ----------------------------------
        (a) -> a*a;

        ------------------------------------------------------------------------------------------------------
        -Vad som krävs vid förändringar-
        () -> System.out.println("Hej");
        a->a*a;
        (a, b) -> a*b;
        */

        LambdaInterfaces.MyQuad quadFunction = a -> a*a;

        LambdaInterfaces.MyLambda aFunction = getFunc();
        aFunction.func(2,2);

        LambdaInterfaces.MyLambda funcA = aFunction;
        LambdaInterfaces.MyLambda funcB = funcA;
        LambdaInterfaces.MyLambda funcC = funcB;

        funcC.func(1,1);


        System.out.println(quadFunction.quad(4));
        System.out.println(quadFunction.quad(8));

        System.out.println(aFunction.func(3,7));


        System.out.println(aFunction.func(8,2));
        System.out.println(aFunction.func(8,0));

        LambdaInterfaces.MyString strLenFunction = (s) -> s.length();
        System.out.println(strLenFunction.strLen("Hello Lambda!"));
    }
}