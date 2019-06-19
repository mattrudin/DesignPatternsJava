package design.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TshirtIterator implements Iterator {
    private final ArrayList<Clothing> tshirts;
    private int position = 0;

    public TshirtIterator(ArrayList<Clothing> tshirts) {
        this.tshirts = tshirts;
    }

    @Override
    public boolean hasNext() {
        return (position + 1) <= tshirts.size();
    }

    @Override
    public Clothing next() {
        return tshirts.get(position++);
    }
}
