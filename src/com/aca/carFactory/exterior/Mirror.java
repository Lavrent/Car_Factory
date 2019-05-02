package com.aca.carFactory.exterior;

public class Mirror extends ExteriorPart {
    public Mirror() {
        super(ExteriorPartType.Mirror);
    }

    @Override
    public ExteriorPartType getType() {
        return ExteriorPartType.Mirror;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
