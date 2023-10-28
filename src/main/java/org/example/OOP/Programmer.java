package org.example.OOP;

public class Programmer extends Workerr implements CanCode {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void code() {
        System.out.println("Пишу код");
    }

}
