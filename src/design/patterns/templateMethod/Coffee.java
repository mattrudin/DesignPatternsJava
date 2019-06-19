package design.patterns.templateMethod;

public class Coffee extends CaffeinBeverage {
    public Coffee(String type) {
        super(type);
    }

    @Override
    public void brew() {
        System.out.println("Brewing coffee-powder for 20 seconds.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }
}
