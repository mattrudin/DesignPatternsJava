package design.patterns.state;

import java.util.Random;

public class DriveState implements State {
    private final Car car;
    Random random = new Random(System.currentTimeMillis());

    public DriveState(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Driving around!");
        int chance = random.nextInt(10);
        if (isCrashing(chance)) {
            car.setState(car.getCrashState());
        }
    }

    @Override
    public void end() {
        System.out.println("Shutting car off.");
        car.setState(car.getParkState());
    }

    private boolean isCrashing(int chance) {
        return chance == 1;
    }
}
