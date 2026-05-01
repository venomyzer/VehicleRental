package com.rental.model;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }

    public void accelerate() {
        System.out.println("Car accelerates normally");
    }
    public void accelerate(int boost) {
        System.out.println("Car accelerates with boost: "+boost);
    }
}
