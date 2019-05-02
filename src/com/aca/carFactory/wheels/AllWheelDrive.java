package com.aca.carFactory.wheels;

public class AllWheelDrive extends Wheel {

    public AllWheelDrive() {
        super( WheelType.All_wheel_drive);
    }

    @Override
    public WheelType getType() {
        return WheelType.All_wheel_drive;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
