package org.example.OOP;

public class Worker {
    String name;
    String type;
    int salary;

    Worker(String name, String type, int salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    void getInfo(int i) {
        String s = "Работник " + name + ". Должность " + type + ". За " + i + " месяцев получил " + salary * 12;
        System.out.println(s);
    }


}
