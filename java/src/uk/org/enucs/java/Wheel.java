package uk.org.enucs.java;

import java.util.ArrayList;

public class Wheel {
    private double percentageFull;
    private double traction;
    private WheelType type;

    private Wheel(WheelType type) {
        this.type = type;
        this.percentageFull = 100.0;

        switch(type) {
            case POOR: traction = 35; break;
            case AVERAGE: traction = 60; break;
            case EXTREME: traction = 90; break;
            default: throw new IllegalArgumentException();
        }
    }

    public static ArrayList<Wheel> generate(WheelType type, int number) {
        ArrayList<Wheel> output = new ArrayList<>();

        for(int i = 0; i < number; i++) {
            output.add(new Wheel(type));
        }

        return output;
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
