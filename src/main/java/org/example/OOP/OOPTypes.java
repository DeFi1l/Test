package org.example.OOP;

public class OOPTypes {
    public static void main(String[] args) {
        String s = "1000";
        String test = "2000";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(test);
        System.out.println(a + b);

        String s1 = "false";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);

        String s2 = "Это Игорь. Он программист.";
        String name = s2.substring(4, 9);
        System.out.println(name);
    }
}
