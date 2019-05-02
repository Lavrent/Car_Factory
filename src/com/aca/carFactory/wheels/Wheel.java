package com.aca.carFactory.wheels;

public abstract class Wheel {
    private WheelType wheelType;

    public Wheel(WheelType wheelType) {
        this.wheelType = wheelType;
        System.out.println("constructing " +getType() +  " wheel with price " + getPrice());
    }

    public abstract WheelType getType();
    public abstract int getPrice();
}
