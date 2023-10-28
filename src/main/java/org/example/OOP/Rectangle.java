package org.example.OOP;

public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double square() {
        return getA() * getB();
    }
}
