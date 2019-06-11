package design.patterns.strategy;

public class Document {
    Saveable saveFile;

    public Document(Saveable saveFile) {
        this.saveFile = saveFile;
    }

    public void setSaveFile(Saveable saveFile) {
        this.saveFile = saveFile;
    }
}
