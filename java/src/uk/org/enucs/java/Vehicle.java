package uk.org.enucs.java;

import java.util.ArrayList;

public abstract class Vehicle {
    private Engine engine;
    private ArrayList<Wheel> wheels;

    public Vehicle(Engine engine, ArrayList<Wheel> wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "engine:" + engine + ", wheels:" + wheels;
    }
}
