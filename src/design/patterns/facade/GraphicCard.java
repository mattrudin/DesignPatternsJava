package design.patterns.facade;

public class GraphicCard implements Powerable {
    @Override
    public void on() {
        System.out.println("Turning graphic card on.");
    }

    @Override
    public void off() {
        System.out.println("Shutting down graphic card.");
    }
}
