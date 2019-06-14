package design.patterns.singleton;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked uniqueInstance;

    private SingletonDoubleChecked() {}

    // Advantage: Higher performance than only synchronized method
    public static SingletonDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
        }
        return uniqueInstance;
    }
}
