package uk.org.enucs.java;

/**
 * Basic Vehicle child class
 */
public class Car extends Vehicle {
    /*
     * Static member variables do not belong to an instance of a class,
     * but rather to the class as a whole.
     * This as been declared as final, so that it cannot be changed.
     */
    public final static int WHEEL_NUM = 4;

    public Car(EngineType engineType, WheelType wheelType) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
    }

    @Override
    public String toString() {
        return '{' + super.toString() + '}';
    }
}
