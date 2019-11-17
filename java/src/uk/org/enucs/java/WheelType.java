package uk.org.enucs.java;

public enum WheelType {
    POOR,
    AVERAGE,
    EXTREME {
        @Override
        public WheelType next() {
            return null;
        }
    };

    public WheelType next() {
        return values()[ordinal() + 1];
    }
}
