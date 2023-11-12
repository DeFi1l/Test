package org.example.JUnit;

public class Calc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 + 15 = " + calc.add(10, 15));
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    int minus(int a, int b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

}
