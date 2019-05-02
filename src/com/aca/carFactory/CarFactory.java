package com.aca.carFactory;

import com.aca.carFactory.car.*;
import com.aca.carFactory.engine.*;
import com.aca.carFactory.exterior.ExteriorPartType;
import com.aca.carFactory.interior.InteriorPartType;
import com.aca.carFactory.wheels.*;

import java.util.Scanner;

public class CarFactory {
    static Scanner in = new Scanner(System.in);

    public static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Sedan:
                car = new Sedan();
                break;
            case Tractor:
                car = new Tractor();
                break;
            case Truck:
                car = new Truck();
                break;
            case Hatchback:
                car = new Hatchback();
                break;
            case Motorcycle:
                car = new MotorCycle();
                break;
            case Crossover:
                car = new Crossover();
                break;
        }
        constructEngine(car);
        constructWheel(car);
        constructExternalPart(car);
        constructInternalPart(car);
        return car;
    }

    public static void constructEngine(Car car) {
        System.out.println("choose the engine  ");
        String engine_type = in.nextLine();
        car.buildEngine(EngineType.valueOf(engine_type));
    }

    public static void constructWheel(Car car) {
        System.out.println("choose the wheel");
        String wheel_type = in.nextLine();
        car.buildWheel(WheelType.valueOf(wheel_type));
    }

    public static void constructExternalPart(Car car) {
        System.out.println("choose the external part  ");
        String external_part_type = in.nextLine();
        car.buildExternalPart(ExteriorPartType.valueOf(external_part_type));
    }

    public static void constructInternalPart(Car car) {
        System.out.println("choose the internal part  ");
        String internal_part_type = in.nextLine();
        car.buildInternalPart(InteriorPartType.valueOf(internal_part_type));
    }
}
