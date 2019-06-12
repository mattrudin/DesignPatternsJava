package design.patterns.decorator;

public class Sugar extends Additionals {
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }
}
