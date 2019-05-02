package com.aca.carFactory.engine;

public class ElectricalEngine extends Engine {

    public ElectricalEngine() {
        super(EngineType.Electrical);
    }

    @Override
    public EngineType getType() {
        return EngineType.Electrical;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
