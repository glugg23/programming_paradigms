package uk.org.enucs.java;

public enum EngineType {
    SMALL,
    AVERAGE,
    MEGA {
        @Override
        public EngineType next() {
            return null;
        }
    };

    public EngineType next() {
        return values()[ordinal() + 1];
    }
}
