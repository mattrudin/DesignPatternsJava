package design.patterns.strategy;

public class SaveAsWord implements Saveable {
    @Override
    public void save() {
        System.out.println("Saved as .docx file.");
    }
}
