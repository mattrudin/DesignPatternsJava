package design.patterns.factory;

public class WordFactory extends DocumentFactory {
    @Override
    public Document generateDocument() {
        return new Word();
    }
}
