package com.aca.carFactory.car;

import com.aca.carFactory.engine.*;
import com.aca.carFactory.wheels.*;

public abstract class Car {
    private int price;
    private Engine engine;
    private CarType carType;
    private Wheel wheel;


    public Car(CarType carType) {
        this.carType = carType;
        System.out.println("building a " + getCarType() + " with price " + getCarPrice());
    }

    public void buildEngine(EngineType engineType) {
        switch (engineType) {
            case Electrical:
                engine = new ElectricalEngine();
                break;
            case Petrol:
                engine = new PetrolEngine();
                break;
            case Diesel:
                engine = new DieselEngine();
                break;
            case Hybrid:
                engine = new HybridEngine();
                break;
        }
    }

    public void buildWheel(WheelType wheelType) {
        switch (wheelType) {
            case ALL_WHEEL_DRIVE:
                wheel = new AllWheelDrive();
                break;
            case BACK_WHEEL_DRIVE:
               wheel = new BackWheelDrive();
                break;
            case FRONT_WHEEL_DRIVE:
               wheel = new FrontWheelDrive();
                break;
        }
    }

    public abstract int getCarPrice();

    public int getTotalPrice() {
        return getCarPrice()+engine.getPrice() + wheel.getPrice();
    }

    public abstract CarType getCarType();
}

