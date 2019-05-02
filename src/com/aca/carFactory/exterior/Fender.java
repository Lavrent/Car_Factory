package com.aca.carFactory.exterior;

public class Fender extends ExteriorPart {
    public Fender() {
        super(ExteriorPartType.Fender);
    }

    @Override
    public ExteriorPartType getType() {
        return ExteriorPartType.Fender;
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
