package org.example.OOP;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    void showVolume() {

        System.out.println(volume());
    }

    double volume() {
        return width * height * length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
