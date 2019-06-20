package design.patterns.state;

public class CrashState implements State {
    private final Car car;

    public CrashState(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Bringing the car into the service...");
        car.setState(car.getMaintenanceState());
    }

    @Override
    public void end() {
        System.out.println("Car is scrap.");
        car.setState(car.getScrapState());
    }
}
