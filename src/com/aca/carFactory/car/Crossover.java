package com.aca.carFactory.car;

public class Crossover extends Car {

    public Crossover(){
        super(CarType.Crossover);
    }

    @Override
    public int getCarPrice() {
        return 15000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Crossover;
    }

}
