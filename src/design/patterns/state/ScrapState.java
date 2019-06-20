package design.patterns.state;

public class ScrapState implements State {
    @Override
    public void start() {
        System.out.println("It's scrap, this car won't drive anymore!");
    }

    @Override
    public void end() {
        System.out.println("It's already at the scrap factory.");
    }
}
