package com.aca.carFactory.wheels;

public class BackWheelDrive extends Wheel {

    public BackWheelDrive(){
        super(WheelType.ALL_WHEEL_DRIVE);
    }

    @Override
    public WheelType getType() {
        return WheelType.BACK_WHEEL_DRIVE;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}

