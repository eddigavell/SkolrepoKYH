package Lecture12.Andreas;

public interface LambdaInterfaces {
    @FunctionalInterface
    interface MyLambda {
        int func(int x, int y);
    }
}
