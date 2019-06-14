package design.patterns.singleton;

public class SingletonEagerly {
    // Instance will be created by the JVM when the class is loaded and is final
    private static final SingletonEagerly uniqueInstance = new SingletonEagerly();

    private SingletonEagerly() {}

    public static SingletonEagerly getInstance() {
        return uniqueInstance;
    }

}
