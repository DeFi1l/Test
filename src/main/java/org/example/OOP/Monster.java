package org.example.OOP;

public class Monster {
    int eyes;
    int legs;
    int hands;

    Monster() {
        this.eyes = 2;
        this.legs = 2;
        this.hands = 2;
    }

    Monster(int eyes) {
        this.eyes = 3;
        this.legs = 2;
        this.hands = 2;
    }

    Monster(int eyes, int legs) {
        this.eyes = 3;
        this.legs = 2;
        this.hands = 2;
    }

    Monster(int eyes, int legs, int hands) {
        this.eyes = 3;
        this.legs = 2;
        this.hands = 2;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("Голос");
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

}
