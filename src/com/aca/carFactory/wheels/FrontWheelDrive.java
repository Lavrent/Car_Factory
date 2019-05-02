package com.aca.carFactory.wheels;

public class FrontWheelDrive extends Wheel {

    public FrontWheelDrive() {
        super( WheelType.FRONT_WHEEL_DRIVE);
    }

    @Override
    public WheelType getType() {
        return WheelType.FRONT_WHEEL_DRIVE;
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}

