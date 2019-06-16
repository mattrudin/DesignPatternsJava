package design.patterns.command;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    // This implementation differs at all commands
    public void execute() {
        light.off();
    }
}
