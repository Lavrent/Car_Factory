package com.aca.carFactory.exterior;

public abstract class ExteriorPart {
    private ExteriorPartType exteriorPartType;

    public ExteriorPart(ExteriorPartType exteriorPartType) {
        this.exteriorPartType = exteriorPartType;
        System.out.println("constructing " + getType() + "  with price " + getPrice());
    }

    public abstract ExteriorPartType getType();

    public abstract int getPrice();
}
