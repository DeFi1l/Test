package org.example.Test;

public class RandomNum {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Случайное число: %s. Попробуйте ещё раз", random);
        System.out.println(result);
    }
}
