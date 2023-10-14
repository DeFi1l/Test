package org.example.OOP;

public class Rect {
    double length;
    double width;

    void setParams(double length, double width) {

        this.length = length;
        this.width = width;

    }

    double square() {
        return width * length;
    }

    double perimeter() {
        return (width + length) * 2;
    }
}
