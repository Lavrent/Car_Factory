package com.aca.carFactory.interior;

public class Airbag extends InteriorPart {

    public Airbag() {
        super(InteriorPartType.Airbag);
    }

    @Override
    public InteriorPartType getType() {
        return InteriorPartType.Airbag;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
