package design.patterns.state;

public class ManufacturingState implements State {
    private final Car car;

    public ManufacturingState(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Car is manufactured, ready for driving!");
        car.setState(car.getDriveState());
    }

    @Override
    public void end() {
        System.out.println("Car is still in the manufacturing hall.");
    }
}
