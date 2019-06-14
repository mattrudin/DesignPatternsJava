package design.patterns;

import design.patterns.abstractFactory.DocumentTypes;
import design.patterns.abstractFactory.SaveAs;
import design.patterns.abstractFactory.WebTypes;

public class Main {

    public static void main(String[] args) {
        SaveAs saveFactory = new SaveAs();
        saveFactory.generateOfficeOf(DocumentTypes.TXT);
        saveFactory.generateOfficeOf(DocumentTypes.WORD);
        saveFactory.generateOfficeOf(DocumentTypes.EXCEL);
        saveFactory.generateWebOf(WebTypes.JS);
        saveFactory.generateWebOf(WebTypes.HTML);
        saveFactory.generateWebOf(WebTypes.CSS);
    }
}
