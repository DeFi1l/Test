package org.example.OOP;

public class Box {
    double width;
    double height;
    double length;

    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }

    double volume1() {
        return width * height * length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
