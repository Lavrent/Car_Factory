package com.aca.carFactory.car;

public class Tractor extends Car {

    public Tractor() {
        super(CarType.Tractor);
    }

    @Override
    public int getCarPrice() {
        return 7000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Tractor;
    }
}
