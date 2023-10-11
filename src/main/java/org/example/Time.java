package org.example;

public class Time {
    public static void main(String[] args) {

        int seconds = 1000000000;
        int secondsInMinuties = 60;
        int secInHour = secondsInMinuties * 60;
        int secInDays = secInHour * 24;

        int days = seconds / secInDays;
        int hours = (seconds % secInDays) / secInHour;
        int minuties = (seconds % secInDays) % secInHour / secondsInMinuties;
        int leftSec = seconds - days * secInDays - hours * secInHour - minuties * secondsInMinuties;
        System.out.println("Дано: " + seconds);
        System.out.println("Это равно: ");
        System.out.println("Дней: "+ days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minuties);
        System.out.println("Секунд: " + leftSec);

    }
}
