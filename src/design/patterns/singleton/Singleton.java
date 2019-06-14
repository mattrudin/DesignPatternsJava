package design.patterns.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    // Disadvantage: no multithreading
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Disadvantage: Minimized performance
    public static synchronized Singleton getThreadsafeInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
