package org.example.OOP;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double square() {
        double p = (getA() + getB() + c) / 2;
        double s = p * ((p - getA()) * (p - getB()) * (p - c));
        return Math.sqrt(s);
    }
}
