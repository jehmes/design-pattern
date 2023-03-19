package br.com.cod3r.observer.restaurant.subject;

import br.com.cod3r.observer.restaurant.model.Order;
import br.com.cod3r.observer.restaurant.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Order order) {
        for (Observer o : observers) {
            o.update(order);
        }
    }
}
