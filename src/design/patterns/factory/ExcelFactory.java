package design.patterns.factory;

public class ExcelFactory extends DocumentFactory {
    @Override
    public Document generateDocument() {
        return new Excel();
    }
}
