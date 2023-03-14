package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public class Chocolate extends DrinkDecorator {
    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        System.out.println("- Adding 30ml of chocolate");
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.3;
    }
}
