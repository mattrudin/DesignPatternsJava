package design.patterns.state;

public class MaintenanceState implements State {
    private final Car car;

    public MaintenanceState(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Like new!");
        car.setState(car.getParkState());
    }

    @Override
    public void end() {
        System.out.println("Car is scrap...");
        car.setState(car.getScrapState());
    }
}
