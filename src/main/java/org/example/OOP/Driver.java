package org.example.OOP;

public class Driver extends Workerr implements CanDrive{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Вожу машину");
    }
}
