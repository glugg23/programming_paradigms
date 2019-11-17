package uk.org.enucs.java;

import java.util.ArrayList;
import java.util.List;

public class Wheel {
    private double percentageFull;
    private double traction;
    private WheelType type;

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

    public static List<Wheel> generate(WheelType type, int number) {
        List<Wheel> output = new ArrayList<>();

        for(int i = 0; i < number; i++) {
            output.add(new Wheel(type));
        }

        return output;
    }

    public Wheel tuneUp() {
        if(this.type != WheelType.EXTREME) {
            return new Wheel(type.next());
        }

        this.percentageFull = 100.0;
        this.traction += 10.0;

        return this;
    }

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
