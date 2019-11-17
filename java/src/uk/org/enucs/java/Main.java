package uk.org.enucs.java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(EngineType.AVERAGE, WheelType.AVERAGE));
        vehicles.add(new Car(EngineType.MEGA, WheelType.POOR));

        vehicles.add(new MotorBike(EngineType.SMALL, WheelType.AVERAGE));
        vehicles.add(new MotorBike(EngineType.SMALL, WheelType.EXTREME));

        vehicles.add(new Truck(EngineType.AVERAGE, WheelType.POOR, 100));
        vehicles.add(new Truck(EngineType.MEGA, WheelType.POOR, 250));

        for(Vehicle v : vehicles) {
            System.out.println(v);
        }
        System.out.println();

        vehicles.stream()
                .map(Vehicle::tuneUp)
                .forEach(System.out::println);
    }
}
