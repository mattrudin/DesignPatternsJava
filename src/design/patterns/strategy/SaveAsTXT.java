package design.patterns.strategy;

public class SaveAsTXT implements Saveable {
    @Override
    public void save() {
        System.out.println("Saved as .txt file.");
    }
}
