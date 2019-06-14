package design.patterns;

import design.patterns.singleton.Singleton;
import design.patterns.singleton.SingletonDoubleChecked;
import design.patterns.singleton.SingletonEagerly;

public class Main {

    public static void main(String[] args) {
        Singleton simpleInstance = Singleton.getInstance();
        Singleton threadsafeInstance = Singleton.getThreadsafeInstance();
        SingletonEagerly eagerlyInstance = SingletonEagerly.getInstance();
        SingletonDoubleChecked doubleCheckedInstance = SingletonDoubleChecked.getInstance();
    }
}
