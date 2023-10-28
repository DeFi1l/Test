package org.example.OOP;

public class Cook extends Workerr implements CanCook{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Готовлю еду");
    }
}
