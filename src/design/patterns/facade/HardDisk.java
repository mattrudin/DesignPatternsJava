package design.patterns.facade;

public class HardDisk implements Powerable {
    @Override
    public void on() {
        System.out.println("Starting hard-disk.");
    }

    @Override
    public void off() {
        System.out.println("Shutting hard-disk down");
    }
}
