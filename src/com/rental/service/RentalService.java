package com.rental.service;

import com.rental.model.Vehicle;

public class RentalService {
    public void rentVehicle(Vehicle vehicle) {

        System.out.println("Renting vehicle: "+vehicle.getBrand());
        vehicle.start();

    }
}
