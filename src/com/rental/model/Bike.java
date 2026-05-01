package com.rental.model;

public class Bike extends Vehicle {

    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Bike starts with self-start");
    }
}
