package org.example.OOP;

public class Catt extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Вискас");
    }

    public void run() {
        System.out.println("Кот бежит");
    }
}
