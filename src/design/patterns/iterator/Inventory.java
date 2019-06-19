package design.patterns.iterator;

import java.util.Iterator;

public interface Inventory {
    public Iterator createIterator();
    public void add(Clothing clothing);
}
