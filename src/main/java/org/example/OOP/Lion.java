package org.example.OOP;

public class Lion extends Inheritance {

    public Lion() {
        super(2,4,true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
