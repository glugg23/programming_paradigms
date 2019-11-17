package uk.org.enucs.java;

public class MotorBike extends Vehicle {
    public final static int WHEEL_NUM = 2;

    public MotorBike(EngineType engineType, WheelType wheelType) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
    }

    @Override
    public String toString() {
        return '{' + super.toString() + '}';
    }
}
