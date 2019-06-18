package design.patterns.facade;

public class Motherboard implements Powerable {
    @Override
    public void on() {
        System.out.println("Starting mainboard.");
    }

    @Override
    public void off() {
        System.out.println("Shutting mainboard down.");
    }
}
