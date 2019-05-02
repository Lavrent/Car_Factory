package com.aca.carFactory.car;

public class MotorCycle extends Car{
    public MotorCycle(){
        super(CarType.Motorcycle);
    }

    @Override
    public int getCarPrice() {
        return 12000;
    }

    @Override
    public CarType getCarType() {
        return CarType.Motorcycle;
    }


}
