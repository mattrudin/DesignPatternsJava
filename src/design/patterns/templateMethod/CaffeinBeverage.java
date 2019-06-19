package design.patterns.templateMethod;

public abstract class CaffeinBeverage {
    private final String type;
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public CaffeinBeverage(String type) {
        this.type = type;
    }

    private void boilWater() {
        System.out.println("Boiling water for " + type + ".");
    }

    private void pourInCup() {
        System.out.println("Pouring " + type + " in cup.");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}
