package design.patterns;

import design.patterns.adapter.EnumerationIterator;

import java.util.Enumeration;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Enumeration enumeration = new StringTokenizer("This is a string.");
        EnumerationIterator enumAdapter = new EnumerationIterator(enumeration);
        for (enumAdapter.next(); enumAdapter.hasNext();) {
            System.out.println(enumAdapter.next());
        }
    }
}
