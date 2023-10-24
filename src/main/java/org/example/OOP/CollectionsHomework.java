package org.example.OOP;

import java.util.ArrayList;

public class CollectionsHomework {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            nums.add(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Вася");
        names.add("Иван");
        names.add("Стёпа");
        names.add("Андрей");
        names.add("Миша");
        names.add("Маша");
        names.add("Валера");
        names.add("Антон");
        names.add("Наташа");
        names.add("Олег");
        names.add("Костя");

        ArrayList<String> numsandnames = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            String s = nums.get(i) + " - " + names.get(i);
            numsandnames.add(s);
        }
        for (String s : numsandnames) {
            System.out.println(s);
        }
    }
}
