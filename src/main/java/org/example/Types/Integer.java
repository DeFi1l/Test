package org.example.Types;

public class Integer {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        c = c + 5;
        c *= 10;
        a = 10;
        b = 3;
        c = a % b;
        c += 5;
        System.out.println("c = " + c);

    }
}