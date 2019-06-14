package design.patterns.abstractFactory;

public class SaveAs extends DocumentFactory {
    @Override
    public OfficeDocument generateOfficeOf(DocumentTypes type) {
        switch (type) {
            case TXT:
                return new TXTDocument();
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            default:
                Error.valueOf(Errors.UNKNOWN_TYPE);
        }
    }

    @Override
    public WebDocument generateWebOf(WebTypes type) {
        switch (type) {
            case JS:
                return new JSDocument();
            case CSS:
                return new CSSDocument();
            case HTML:
                return new HTMLDocument();
            default:
                Error.valueOf(Errors.UNKNOWN_TYPE);
        }
    }
}
