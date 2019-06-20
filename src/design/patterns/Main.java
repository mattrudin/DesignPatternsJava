package design.patterns;

import design.patterns.state.Car;

public class Main {

    public static void main(String[] args) {
        Car alfaRomeo = new Car();
        alfaRomeo.shutoff();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.drive();
        alfaRomeo.shutoff();
    }
}
