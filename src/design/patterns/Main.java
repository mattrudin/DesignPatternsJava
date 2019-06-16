package design.patterns;

import design.patterns.command.Light;
import design.patterns.command.LightOffCommand;
import design.patterns.command.LightOnCommand;
import design.patterns.command.RemoteControl;

public class Main {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        // Set lightOn command
        remote.setSlot(lightOn);
        remote.pressButton();

        // Set lightOff command
        remote.setSlot(lightOff);
        remote.pressButton();
    }
}
