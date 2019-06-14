package design.patterns.abstractFactory;

public class Error {
    public static void valueOf(Errors type) {
        switch (type) {
            case UNKNOWN_TYPE:
                throw new IllegalArgumentException("Unknown type");
            default:
                throw new RuntimeException();
        }
    }
}
