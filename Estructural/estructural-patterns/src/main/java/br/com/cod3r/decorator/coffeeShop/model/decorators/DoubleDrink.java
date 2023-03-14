package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding more 100ml");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.75;
    }
}
