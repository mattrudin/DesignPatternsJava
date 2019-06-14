package design.patterns.abstractFactory;

public class ExcelDocument extends OfficeDocument {
    public ExcelDocument() {
        setType(DocumentTypes.EXCEL);
    }
}
