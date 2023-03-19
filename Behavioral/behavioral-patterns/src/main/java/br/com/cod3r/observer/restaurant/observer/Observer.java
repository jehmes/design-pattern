package br.com.cod3r.observer.restaurant.observer;

import br.com.cod3r.observer.restaurant.model.Order;

public interface Observer {
    void update(Order order);
}
