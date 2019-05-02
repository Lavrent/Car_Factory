package com.aca.carFactory.wheels;

public class FrontWheelDrive extends Wheel {

    public FrontWheelDrive() {
        super( WheelType.Front_wheel_drive);
    }

    @Override
    public WheelType getType() {
        return WheelType.Front_wheel_drive;
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}

