package com.aca.carFactory.car;

public class Sedan extends Car {

    public Sedan() {
        super(CarType.Sedan);
    }

    @Override
    public int getCarPrice() {
        return 20000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Sedan;
    }
}

