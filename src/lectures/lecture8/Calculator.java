package lectures.lecture8;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        return a/b;
    }

    public static int modulo(int a, int b) {
        return a%b;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int sqrt(int a, int b) {
        return (int) Math.sqrt(a+b);
    }

    public static void main(String[] args) {
        int a, b;
        String method;
        System.out.println("Welcome to the Calculator!");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            a = sc.nextInt();
            method = sc.next();
            b = sc.nextInt();

            switch (method) {
                case "+" -> System.out.println("The answer is: " + add(a, b));
                case "-" -> System.out.println("The answer is: " + sub(a, b));
                case "*" -> System.out.println("The answer is: " + multiply(a, b));
                case "/" -> System.out.println("The answer is: " + div(a, b));
                case "%" -> System.out.println("The answer is: " + modulo(a, b));
                case "max" -> System.out.println("The answer is: " + max(a, b));
                case "sqrt" -> System.out.println("The answer is: " + sqrt(a, b));
                default -> throwException();
            }
        }
    }

    public static void throwException() {
        throw new IllegalArgumentException("This method is not supported yet");
    }
}
