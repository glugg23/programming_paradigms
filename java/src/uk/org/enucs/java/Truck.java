package uk.org.enucs.java;

/**
 * Child of Vehicle
 */
public class Truck extends Vehicle {
    public final static int WHEEL_NUM = 4;

    //This child class has a new member variable
    private int trailerCapacity;

    public Truck(EngineType engineType, WheelType wheelType, int trailerCapacity) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
        this.trailerCapacity = trailerCapacity;
    }

    /***
     * Here we override the parent method for tuneUp, so that the trailer capacity can be increased as well
     * To do this we call the parent version first using `super.tuneUp()`, and then increase the trailer capacity.
     * @return a tuned up truck
     */
    @Override
    public Vehicle tuneUp() {
        super.tuneUp();
        this.trailerCapacity += 100;

        return this;
    }

    /*
     * Encapsulation: This time we can both get and set trailer capacity
     */
    public int getTrailerCapacity() {
        return trailerCapacity;
    }

    public void setTrailerCapacity(int trailerCapacity) {
        this.trailerCapacity = trailerCapacity;
    }

    @Override
    public String toString() {
        return '{' + super.toString() + ", trailerCapacity:" + trailerCapacity + '}';
    }
}
