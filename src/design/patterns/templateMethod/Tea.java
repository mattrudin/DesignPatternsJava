package design.patterns.templateMethod;

public class Tea extends CaffeinBeverage {
    public Tea(String type) {
        super(type);
    }

    @Override
    public void brew() {
        System.out.println("Brewing tea-bag for 5 minutes.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon piece.");
    }
}
