package design.patterns.command;

public class RemoteControl {
    // Programming against interface
    Command slot;

    public RemoteControl() { }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void pressButton() {
        slot.execute();
    }
}
