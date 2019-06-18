package design.patterns.facade;

public class CPU implements Powerable {
    @Override
    public void on() {
        System.out.println("CPU powering up.");
    }

    @Override
    public void off() {
        System.out.println("CPU powering down");
    }
}
