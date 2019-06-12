package design.patterns;

import design.patterns.decorator.Coffee;
import design.patterns.decorator.Espresso;
import design.patterns.decorator.Milk;
import design.patterns.decorator.Sugar;

public class Main {

    public static void main(String[] args) {
        Coffee espressoWithMilkAndSugar = new Sugar(new Milk(new Espresso()));
        System.out.println(espressoWithMilkAndSugar.cost());
        System.out.println(espressoWithMilkAndSugar.getDescription());

        Coffee espressoWithMilk = new Milk(new Espresso());
        System.out.println(espressoWithMilk.cost());
        System.out.println(espressoWithMilk.getDescription());
    }
}
