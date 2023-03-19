package br.com.cod3r.observer.restaurant.subject;

import br.com.cod3r.observer.restaurant.model.Order;

public class Kitchen extends Subject {
    private Order order;

    public Kitchen(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

}
