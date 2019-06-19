package design.patterns.iterator;

import java.util.Iterator;

public class Trousers implements Inventory {
    private static final int MAX_ITEMS = 3;
    private int numberOfItems = 0;
    private Clothing[] trousers;

    public Trousers() {
        trousers = new Clothing[MAX_ITEMS];
    }

    public void add(Clothing clothing) {
        if(numberOfItems <= MAX_ITEMS) {
            trousers[numberOfItems++] = clothing;
        }
    }

    @Override
    public Iterator createIterator() {
        return new TrousersIterator(trousers);
    }
}
