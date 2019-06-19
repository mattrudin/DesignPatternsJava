package design.patterns.iterator;

public class Clothing {
    private String description;

    public Clothing(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
