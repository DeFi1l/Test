package org.example.OOP;

public class Director {
    public void force(Cookable cookable) {
        cookable.cook();
    }

    public void force1(Counter counter, int amount) {
        String s = counter.result(amount);
        System.out.println(s);
    }

}
