package org.example.OOP;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double weight) {
        super();
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Вес коробки: " + weight);
    }

}
