package design.patterns;

import design.patterns.facade.*;

public class Main {

    public static void main(String[] args) {
        Powerable cpu = new CPU();
        Powerable motherboard = new Motherboard();
        Powerable hardDisk = new HardDisk();
        Powerable graphicCard = new GraphicCard();
        Powerable cpuFan = new CPUfan();

        ComputerFacade computer = new ComputerFacade(cpu, motherboard, hardDisk, graphicCard, cpuFan);
        computer.on();
        System.out.println("\n ~~~~ Computer is running ~~~~\n");
        computer.off();
    }
}
