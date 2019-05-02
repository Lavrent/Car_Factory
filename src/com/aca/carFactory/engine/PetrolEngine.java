package com.aca.carFactory.engine;

public class PetrolEngine extends Engine {
    public PetrolEngine(){
        super(EngineType.Petrol);
        }

    @Override
    public EngineType getType() {
        return EngineType.Petrol;
    }

    @Override
    public int getPrice() {
        return 4000;
    }

}
