package com.rental.model;

public abstract class Vehicle {
    private String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand=brand;
        this.speed=speed;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void start();

    void display() {
        System.out.println("Brand: "+brand + "Speed: "+speed);
    }
}