package br.com.cod3r.observer.restaurant;


import br.com.cod3r.observer.restaurant.model.Order;
import br.com.cod3r.observer.restaurant.observer.Observer;
import br.com.cod3r.observer.restaurant.observer.Waiter;
import br.com.cod3r.observer.restaurant.subject.Kitchen;

public class Client {

	public static void main(String[] args) {
		Order order = new Order(1, "Milkshake", true);

		Observer waiter = new Waiter("Jehmes");

		Kitchen kitchen = new Kitchen(order);

		kitchen.addObserver(waiter);
		kitchen.notifyObservers(kitchen.getOrder());

	}
}
