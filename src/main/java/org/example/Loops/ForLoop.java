package org.example.Loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1000; i >= 100; i--) {
            if (i % 5 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
