package design.patterns.strategy;

public class SaveAsExcel implements Saveable {
    @Override
    public void save() {
        System.out.println("Saved as .xlsx file.");
    }
}
