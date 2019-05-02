package com.aca.carFactory.wheels;

public class BackWheelDrive extends Wheel {

    public BackWheelDrive(){
        super(WheelType.Back_Wheel_drive);
    }

    @Override
    public WheelType getType() {
        return WheelType.Back_Wheel_drive;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}

