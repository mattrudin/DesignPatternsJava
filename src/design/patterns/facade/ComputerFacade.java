package design.patterns.facade;

public class ComputerFacade implements Powerable {
    Powerable CPU;
    Powerable motherboard;
    Powerable hardDisk;
    Powerable graphicCard;
    Powerable CPUfan;

    public ComputerFacade(Powerable CPU, Powerable motherboard, Powerable hardDisk, Powerable graphicCard, Powerable CPUfan) {
        this.CPU = CPU;
        this.motherboard = motherboard;
        this.hardDisk = hardDisk;
        this.graphicCard = graphicCard;
        this.CPUfan = CPUfan;
    }


    @Override
    public void on() {
        CPU.on();
        motherboard.on();
        hardDisk.on();
        graphicCard.on();
        CPUfan.on();
    }

    @Override
    public void off() {
        CPU.off();
        motherboard.off();
        hardDisk.off();
        graphicCard.off();
        CPUfan.off();
    }
}
