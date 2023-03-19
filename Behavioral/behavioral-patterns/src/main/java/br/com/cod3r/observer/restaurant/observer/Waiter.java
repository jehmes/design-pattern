package br.com.cod3r.observer.restaurant.observer;

import br.com.cod3r.observer.restaurant.model.Order;

public class Waiter implements Observer {
    private String name;
    private Order order;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        this.order = order;
        if (!order.isReady())
            System.out.println("Ok, Im waiting");
        else
            deliveryOrder();
    }

    private void deliveryOrder() {
        System.out.println(String.format("Waiter %s, please delivery the order: %d = %s", name, order.getId(), order.getName()));
    }
}
