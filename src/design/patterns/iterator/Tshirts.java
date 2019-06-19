package design.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Tshirts implements Inventory {
    private ArrayList<Clothing> tShirts;

    public Tshirts() {
        tShirts = new ArrayList<Clothing>();
    }

    @Override
    public Iterator createIterator() {
        return new TshirtIterator(tShirts);
    }

    @Override
    public void add(Clothing clothing) {
        tShirts.add(clothing);
    }
}
