package br.com.cod3r.decorator.pizza.decorator;

import br.com.cod3r.decorator.pizza.Pizza;

import java.util.List;

public class Topping extends PizzaDecorator {
    public Topping(Pizza pizza, List<String> extras) {
        super(pizza, extras);
    }

    @Override
    public void prepare() {
        pizza.prepare();
        System.out.println(" - Adding topping: " + extras);
    }

    @Override
    public void bake() {
        pizza.bake();
    }

    @Override
    public void order() {
        pizza.order();
    }
}
