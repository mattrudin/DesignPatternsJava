package design.patterns.abstractFactory;

public abstract class WebDocument {
    WebTypes type;

    public WebTypes getType() {
        return type;
    }

    public void setType(WebTypes type) {
        this.type = type;
    }
}
