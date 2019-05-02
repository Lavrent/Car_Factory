package com.aca.carFactory.car;

import com.aca.carFactory.engine.*;
import com.aca.carFactory.exterior.*;
import com.aca.carFactory.interior.*;
import com.aca.carFactory.wheels.*;

public abstract class Car {
    private int price;
    private Engine engine;
    private CarType carType;
    private Wheel wheel;
    private InteriorPart interiorPart;
    private ExteriorPart exteriorPart;


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
            case All_wheel_drive:
                wheel = new AllWheelDrive();
                break;
            case Back_Wheel_drive:
                wheel = new BackWheelDrive();
                break;
            case Front_wheel_drive:
                wheel = new FrontWheelDrive();
                break;
        }
    }

    public void buildInternalPart(InteriorPartType interiorPartType) {
        switch (interiorPartType) {
            case Seat_belt:
                interiorPart = new SeatBelt();
                break;
            case Speedometer:
                interiorPart = new Speedometer();
                break;
            case Airbag:
                interiorPart = new Airbag();
                break;
        }
    }

    public void buildExternalPart(ExteriorPartType exteriorPartType) {
        switch (exteriorPartType) {
            case Mirror:
                exteriorPart = new Mirror();
                break;
            case Fender:
                exteriorPart = new Fender();
                break;
            case Spoiler:
                exteriorPart = new Spoiler();
                break;
        }
    }

    public abstract int getCarPrice();

    public int getTotalPrice() {
        return getCarPrice() + engine.getPrice() + wheel.getPrice() + exteriorPart.getPrice() + interiorPart.getPrice();
    }

    public abstract CarType getCarType();
}

