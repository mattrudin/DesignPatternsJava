package design.patterns.command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    // This implementation differs at all commands
    public void execute() {
        light.on();
    }
}
