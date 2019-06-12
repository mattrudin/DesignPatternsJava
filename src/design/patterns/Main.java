package design.patterns;

import design.patterns.observer.*;

public class Main {

    public static void main(String[] args) {
        Journal GQ = new Journal();
        Observer YourDailyCompany = new Company();
        Observer YourNeighbour = new Household();

        // Register the observers
        GQ.registerObserver(YourDailyCompany);
        GQ.registerObserver(YourNeighbour);

        // Change the title and push it to all observers
        GQ.setTitleOfTheMonth("Amazing Hot Dogs for this Summer");
        GQ.notifyObservers();

        // Change the title and push it to all observers
        GQ.setTitleOfTheMonth("99 BBQ Tips");
        GQ.notifyObservers();
    }
}
