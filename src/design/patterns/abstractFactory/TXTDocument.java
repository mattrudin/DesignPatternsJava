package design.patterns.abstractFactory;

public class TXTDocument extends OfficeDocument {
    public TXTDocument() {
        setType(DocumentTypes.TXT);
    }
}
