package com.aca.carFactory.interior;

public abstract class InteriorPart {
    private InteriorPartType interiorPartType;

    public InteriorPart(InteriorPartType interiorPartType) {
        this.interiorPartType = interiorPartType;
        System.out.println("constructing " + getType() + "  with price " + getPrice());
    }

    public abstract InteriorPartType getType();

    public abstract int getPrice();
}

