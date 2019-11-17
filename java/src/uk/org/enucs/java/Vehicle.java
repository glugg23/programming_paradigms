package uk.org.enucs.java;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Vehicle {
    private Engine engine;
    private List<Wheel> wheels;

    public Vehicle(Engine engine, List<Wheel> wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Vehicle tuneUp() {
        if(this.getEngine().getType() != EngineType.MEGA) {
            this.setEngine(new Engine(this.getEngine().getType().next()));
        }

        this.setWheels(this.getWheels().stream()
                .map(Wheel::tuneUp)
                .collect(Collectors.toList()));

        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "engine:" + engine + ", wheels:" + wheels;
    }
}
