package com.aca.carFactory.engine;

public class HybridEngine extends Engine {
    public HybridEngine() {
        super( EngineType.Hybrid);
    }

    @Override
    public EngineType getType() {
        return EngineType.Hybrid;
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
