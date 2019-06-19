package design.patterns.iterator;

import java.util.Iterator;

public class TrousersIterator implements Iterator {
    private final Clothing[] trousers;
    private int position = 0;

    public TrousersIterator(Clothing[] trousers) {
        this.trousers = trousers;
    }

    @Override
    public boolean hasNext() {
        return (position < trousers.length) && (trousers[position] != null);
    }

    @Override
    public Clothing next() {
        return trousers[position++];
    }
}
