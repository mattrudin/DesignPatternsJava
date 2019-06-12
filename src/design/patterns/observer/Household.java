package design.patterns.observer;

public class Household implements Observer {
    @Override
    public void update(String text) {
        System.out.println("Fido, get the journal with the title \"" + text + "\".");
    }
}
