package design.patterns.state;

public class Car {
    private State state;
    private final State manufacturingState;
    private final State driveState;
    private final State parkState;
    private final State crashState;
    private final State maintenanceState;
    private final State scrapState;

    public Car() {
        manufacturingState = new ManufacturingState(this);
        driveState = new DriveState(this);
        parkState = new ParkState(this);
        crashState = new CrashState(this);
        maintenanceState = new MaintenanceState(this);
        scrapState = new ScrapState();

        setState(manufacturingState);
    }

    protected State getManufacturingState() {
        return manufacturingState;
    }

    protected State getDriveState() {
        return driveState;
    }

    protected State getParkState() {
        return parkState;
    }

    protected State getCrashState() {
        return crashState;
    }

    protected State getMaintenanceState() {
        return maintenanceState;
    }

    protected State getScrapState() {
        return scrapState;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void drive() {
        state.start();
    }

    public void shutoff() {
        state.end();
    }

}
