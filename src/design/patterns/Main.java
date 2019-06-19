package design.patterns;

import design.patterns.iterator.Clothing;
import design.patterns.iterator.Inventory;
import design.patterns.iterator.Trousers;
import design.patterns.iterator.Tshirts;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Clothing tShirtS = new Clothing("Tshirt, size S");
        Clothing tShirtM = new Clothing("Tshirt, size M");
        Clothing tShirtL = new Clothing("Tshirt, size L");

        Inventory tShirtInventory = new Tshirts();
        tShirtInventory.add(tShirtS);
        tShirtInventory.add(tShirtM);
        tShirtInventory.add(tShirtL);

        System.out.println("\n~~~~Showing the Tshirt inventory~~~~");
        Iterator tShirtIterator = tShirtInventory.createIterator();
        while (tShirtIterator.hasNext()) {
            System.out.println(tShirtIterator.next());
        }


        Clothing trouserS = new Clothing("Trouser, size S");
        Clothing trouserM = new Clothing("Trouser, size M");
        Clothing trouserL = new Clothing("Trouser, size L");

        Inventory trouserInventory = new Trousers();
        trouserInventory.add(trouserS);
        trouserInventory.add(trouserM);
        trouserInventory.add(trouserL);

        System.out.println("\n~~~~Showing the Trouser inventory~~~~");
        Iterator trouserIterator = trouserInventory.createIterator();
        while (trouserIterator.hasNext()) {
            System.out.println(trouserIterator.next());
        }
    }
}
