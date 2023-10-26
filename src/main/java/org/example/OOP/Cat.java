package org.example.OOP;

public class Cat extends Inheritance {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
