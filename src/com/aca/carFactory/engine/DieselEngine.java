package com.aca.carFactory.engine;

public class DieselEngine extends Engine {
    public DieselEngine() {
        super(EngineType.Diesel);
    }

    @Override
    public EngineType getType() {
        return EngineType.Diesel;
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
