package com.aca.carFactory.engine;

public abstract class Engine {

    private EngineType engineType;

    public Engine( EngineType engineType) {
        this.engineType = engineType;
        System.out.println("constructing " +getType() +  " engine with price " + getPrice());
    }

    public abstract EngineType getType();

    public abstract int getPrice();
}
