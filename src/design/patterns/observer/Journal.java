package design.patterns.observer;

import java.util.ArrayList;

public class Journal implements Subject {
    private ArrayList<Observer> observers;
    private String titleOfTheMonth;

    public Journal() {
        observers = new ArrayList<>();
    }

    public void setTitleOfTheMonth(String titleOfTheMonth) {
        this.titleOfTheMonth = titleOfTheMonth;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(titleOfTheMonth);
        }
    }
}
