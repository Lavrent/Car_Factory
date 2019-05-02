package com.aca.carFactory.exterior;

public class Spoiler extends ExteriorPart {
    public Spoiler() {
        super(ExteriorPartType.Spoiler);
    }

    @Override
    public ExteriorPartType getType() {
        return ExteriorPartType.Spoiler;
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
