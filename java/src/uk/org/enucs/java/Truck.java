package uk.org.enucs.java;

public class Truck extends Vehicle {
    public final static int WHEEL_NUM = 4;

    private int trailerCapacity;

    public Truck(EngineType engineType, WheelType wheelType, int trailerCapacity) {
        super(new Engine(engineType), Wheel.generate(wheelType, WHEEL_NUM));
        this.trailerCapacity = trailerCapacity;
    }

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
