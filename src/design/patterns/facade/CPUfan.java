package design.patterns.facade;

public class CPUfan implements Powerable {
    @Override
    public void on() {
        System.out.println("Bringing the fan to high speed!!");
    }

    @Override
    public void off() {
        System.out.println("Lowering the speed down to zero...");
    }
}
