package uk.org.enucs.java;

import java.util.ArrayList;
import java.util.List;

public class Wheel {
    private double percentageFull;
    private double traction;
    private WheelType type;

    /**
     * This constructor is private, outside of this class it is not possible to create a single instance of a wheel
     * @param type the wheel type to create
     */
    private Wheel(WheelType type) {
        this.type = type;
        this.percentageFull = 100.0;

        switch(type) {
            case POOR: traction = 35.0; break;
            case AVERAGE: traction = 60.0; break;
            case EXTREME: traction = 90.0; break;
            default: throw new IllegalArgumentException();
        }
    }

    /**
     * Instead we have this factory method which generates a list of wheels.
     * This is marked as static, this means that the method belongs to the class but doesn't act on an instance
     * of the class. E.g. it's called with `Wheel.generate(...)` rather than
     * ```
     * Wheel w = new Wheel(...);
     * var list = w.generate(...);
     * ```
     * @param type the type of wheels to create
     * @param number the number of wheels to create
     * @return a list of wheels
     */
    public static List<Wheel> generate(WheelType type, int number) {
        List<Wheel> output = new ArrayList<>();

        for(int i = 0; i < number; i++) {
            output.add(new Wheel(type));
        }

        return output;
    }

    /**
     * A tune up function for the wheel
     * @return a new wheel if the type is not extreme, otherwise increases traction
     */
    public Wheel tuneUp() {
        if(this.type != WheelType.EXTREME) {
            return new Wheel(type.next());
        }

        this.percentageFull = 100.0;
        this.traction += 10.0;

        return this;
    }

    /*
     * We can set the percentage full and the traction, but we cannot change the type of a wheel
     */
    public double getPercentageFull() {
        return percentageFull;
    }

    public double getTraction() {
        return traction;
    }

    public WheelType getType() {
        return type;
    }

    public void setPercentageFull(double percentageFull) {
        this.percentageFull = percentageFull;
    }

    public void setTraction(double traction) {
        this.traction = traction;
    }

    @Override
    public String toString() {
        return "{type:" + type + ", percentageFull:" + percentageFull + ", traction:" + traction + '}';
    }
}
