package design.patterns.factory;

public class TXTFactory extends DocumentFactory {
    @Override
    public Document generateDocument() {
        return new TXT();
    }
}
