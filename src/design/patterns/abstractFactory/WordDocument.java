package design.patterns.abstractFactory;

public class WordDocument extends OfficeDocument {
    public WordDocument() {
        setType(DocumentTypes.WORD);
    }
}
