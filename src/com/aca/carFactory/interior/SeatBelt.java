package com.aca.carFactory.interior;

public class SeatBelt extends InteriorPart {
    public SeatBelt() {
        super(InteriorPartType.Seat_belt);
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
