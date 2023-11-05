package org.example.Homework;

public class Spaces {
    public static void main(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }
        String name = "Иван";
        int age = 33;
        String result = "Привет, \'" + name + "\'! \nТебе " + age + " года.";
        System.out.println(result);

        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String res = "";
        for (int i = 0; i < months.length; i++) {
            res += months[i];
            if (i == months.length - 1) {
                res += ".";
            } else {
                res += ", ";
            }
        }
        System.out.println(res);
        String month = "Май";

        switch (month) {
            case "Январь":
            case "Февраль":
            case "Декабрь":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
            default:
                System.out.println("Error!");
        }
    }
}
