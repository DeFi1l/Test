package org.example.OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Сергей");
        employees.add("Маша");
        employees.add("Света");
        employees.add("Дима");
        employees.remove(0);
        employees.remove("Наталья");
        for (String name : employees) {
            System.out.println(name);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);


        HashSet<String> names = new HashSet<>();
        names.add("Вика");
        names.add("Женя");
        names.add("Миша");
        names.add("Петя");

        for (String name : names) {
            System.out.println(name);
        }


        TreeSet<String> name = new TreeSet<>();
        name.add("Вика");
        name.add("Женя");
        name.add("Петя");
        name.add("Миша");

        for (String n : name) {
            System.out.println(n);
        }
    }
}
