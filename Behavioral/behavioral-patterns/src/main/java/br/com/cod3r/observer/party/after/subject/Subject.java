package br.com.cod3r.observer.party.after.subject;

import br.com.cod3r.observer.party.after.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
