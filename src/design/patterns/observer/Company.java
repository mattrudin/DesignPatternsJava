package design.patterns.observer;

public class Company implements Observer {
    @Override
    public void update(String text) {
        System.out.println("Dear employees, please find the journal with the title \"" + text + "\" in the cafeteria.");
    }
}
