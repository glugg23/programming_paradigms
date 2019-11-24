package uk.org.enucs.java;

import java.util.List;
import java.util.stream.Collectors;

/***
 * Base class for all the other ones.
 * Marked as abstract as we don't want to be able to create a general Vehicle instance
 */
public abstract class Vehicle {
    /*
     * Composition: we store an Engine object and a list of Wheel objects
     */
    private Engine engine;
    private List<Wheel> wheels;

    public Vehicle(Engine engine, List<Wheel> wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    /***
     * Upgrades the engine if it is not at max and then tunes up all the wheels
     * @return a tuned up vehicle
     */
    public Vehicle tuneUp() {
        if(this.getEngine().getType() != EngineType.MEGA) {
            this.engine = new Engine(this.getEngine().getType().next());
        }

        //Map the tuneUp function over all the wheels, and then collect into a list
        this.wheels = this.getWheels().stream()
                .map(Wheel::tuneUp)
                .collect(Collectors.toList());

        return this;
    }

    /*
     * Encapsulation: we can't change the engine and wheels, only read their value
     */
    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "engine:" + engine + ", wheels:" + wheels;
    }
}
