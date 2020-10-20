package Lecture12;

public interface LambdaInterfaces {
    @FunctionalInterface
    interface Hello {
        void sayHello();
    }

    @FunctionalInterface
    interface MyQuad {
        int quad(int a);
    }

    @FunctionalInterface
    interface MyLambda {
        int func(int x, int y);
    }

    @FunctionalInterface
    interface MyString {
        int strLen(String x);
    }
}
