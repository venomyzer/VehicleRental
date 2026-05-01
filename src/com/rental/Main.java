package com.rental;
import com.rental.model.*;
import com.rental.service.RentalService;

public class Main {
    public static void main(String[] args) {

        RentalService service = new RentalService();

        Vehicle v1 = new Car("Toyota",200);
        Vehicle v2 = new Bike("Yamaha",120);

        service.rentVehicle(v1);
        service.rentVehicle(v2);


        Car car = (Car) v1;
        car.accelerate(20);

    }
}
