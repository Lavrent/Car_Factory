package com.aca.carFactory.car;

public class Truck extends Car {

    public Truck() {
        super(CarType.Truck);
    }

    @Override
    public int getCarPrice() {
        return 9000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Truck;
    }

}
