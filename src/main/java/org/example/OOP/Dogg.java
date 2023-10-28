package org.example.OOP;

public class Dogg extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Кость");
    }

    public void run() {
        System.out.println("Собака бежит");
    }
}
