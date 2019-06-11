package design.patterns;

import design.patterns.strategy.Document;
import design.patterns.strategy.SaveAsExcel;
import design.patterns.strategy.SaveAsTXT;
import design.patterns.strategy.SaveAsWord;

public class Main {

    public static void main(String[] args) {
        Document excelFile = new Document(new SaveAsExcel());
        Document txtFile = new Document(new SaveAsTXT());
        Document wordFile = new Document(new SaveAsWord());

        excelFile.performSave();
        txtFile.performSave();
        wordFile.performSave();

        // Behaviour can be changed at runtime
        excelFile.setSaveFile(new SaveAsTXT());
        excelFile.performSave();
    }
}
