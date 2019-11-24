package uk.org.enucs.java;

/**
 * Similar basic child Vehicle class
 */
public class MotorBike extends Vehicle {
    //This one has a different wheel number
    public final static int WHEEL_NUM = 2;

    public MotorBike(EngineType engineType, WheelType wheelType) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
    }

    @Override
    public String toString() {
        return '{' + super.toString() + '}';
    }
}
