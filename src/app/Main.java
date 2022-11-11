package app;

public class Main {
    static int a;
    static int b;
    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int r = subtraction(a,b);
        System.out.println(r);
        int t = division(a,b);
        System.out.println(t);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }
    private static int division (int a, int b) {
        return a / b;
    }
}
