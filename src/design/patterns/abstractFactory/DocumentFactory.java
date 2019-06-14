package design.patterns.abstractFactory;

public abstract class DocumentFactory {
    public abstract OfficeDocument generateOfficeOf(DocumentTypes type);
    public abstract WebDocument generateWebOf(WebTypes type);
}
