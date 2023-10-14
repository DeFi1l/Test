package org.example.OOP;

public class Dog {
    String name;
    String kind;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);

    }

    String info() {
        return "Кличка: " + name + " Порода: " + kind + " Скорость " + speed;
    }
}
