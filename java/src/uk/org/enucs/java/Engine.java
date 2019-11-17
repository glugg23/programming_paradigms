package uk.org.enucs.java;

public class Engine {
    private int cc;
    private double mpg;
    private EngineType type;

    public Engine(EngineType type) {
        this.type = type;

        switch(type) {
            case SMALL:
                this.cc = 50;
                this.mpg = 40;
                break;
            case AVERAGE:
                this.cc = 100;
                this.mpg = 25;
                break;
            case MEGA:
                this.cc = 150;
                this.mpg = 10;
                break;
            default: throw new IllegalArgumentException();
        }
    }

    public int getCC() {
        return cc;
    }

    public double getMPG() {
        return mpg;
    }

    public EngineType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{type: "+ type +", cc:" + cc + ", mpg:" + mpg + '}';
    }
}
