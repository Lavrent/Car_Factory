package com.aca.carFactory;
import com.aca.carFactory.car.Car;
import com.aca.carFactory.car.CarType;
import java.util.Scanner;

public class CarConstruction {
    public static void produceCar(){
        Scanner in = new Scanner(System.in);
        System.out.println("choose the car type");
        String car_type = in.nextLine();
        Car car = CarFactory.buildCar(CarType.valueOf(car_type));
        System.out.println("Total car price with parts is " + car.getTotalPrice());
    }
}
