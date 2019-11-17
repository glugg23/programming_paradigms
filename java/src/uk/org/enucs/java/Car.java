package uk.org.enucs.java;

public class Car extends Vehicle {
    public final static int WHEEL_NUM = 4;

    public Car(EngineType engineType, WheelType wheelType) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
    }

    @Override
    public String toString() {
        return '{' + super.toString() + '}';
    }
}
