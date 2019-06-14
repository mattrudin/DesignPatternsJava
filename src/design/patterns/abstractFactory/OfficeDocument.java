package design.patterns.abstractFactory;

public abstract class OfficeDocument {
    private DocumentTypes type;

    public DocumentTypes getType() {
        return type;
    }

    public void setType(DocumentTypes type) {
        this.type = type;
    }
}
