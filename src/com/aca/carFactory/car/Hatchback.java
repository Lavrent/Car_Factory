package com.aca.carFactory.car;

public class Hatchback extends Car {

    public Hatchback() {
        super(CarType.Hatchback);
    }


    @Override
    public int getCarPrice() {
        return 10000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Hatchback;
    }


}