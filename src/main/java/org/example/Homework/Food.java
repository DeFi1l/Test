package org.example.Homework;

public class Food {
    public static void main(String[] args) {

        int money = 400;
        if (money > 500) {
            System.out.println("Пицца");
        } else if (money < 500 || money > 300) {
            System.out.println("Шаурма");
        } else if (money < 100 || money > 300) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Гамбургер");
        }
    }
}