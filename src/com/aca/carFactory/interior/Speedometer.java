package com.aca.carFactory.interior;

public class Speedometer extends InteriorPart {
    public Speedometer() {
        super(InteriorPartType.Speedometer);
    }

    @Override
    public InteriorPartType getType() {
        return InteriorPartType.Seat_belt;
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
