package com.aca.carFactory.wheels;

public class AllWheelDrive extends Wheel {

    public AllWheelDrive() {
        super( WheelType.ALL_WHEEL_DRIVE);
    }

    @Override
    public WheelType getType() {
        return WheelType.ALL_WHEEL_DRIVE;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
