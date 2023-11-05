package org.example.Excpetions;

public class Exceptions {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (Exception e1) {

        } finally {
            System.out.println("Мы в блоке finally");
        }
    }
}
