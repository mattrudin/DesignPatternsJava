package design.patterns.state;

public class ParkState implements State {
    private final Car car;

    public ParkState(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Starting the motor...getting ready!");
        car.setState(car.getDriveState());
    }

    @Override
    public void end() {
        System.out.println("Car is still off.");
    }
}
