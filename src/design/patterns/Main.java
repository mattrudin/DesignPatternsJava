package design.patterns;

import design.patterns.templateMethod.CaffeinBeverage;
import design.patterns.templateMethod.Coffee;
import design.patterns.templateMethod.Tea;

public class Main {

    public static void main(String[] args) {
        CaffeinBeverage espresso = new Coffee("espresso");
        espresso.prepareRecipe();

        CaffeinBeverage earlGrey = new Tea("earl grey tea");
        earlGrey.prepareRecipe();
    }
}
