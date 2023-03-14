package br.com.cod3r.decorator.pizza.decorator;

import br.com.cod3r.decorator.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Ingredients extends PizzaDecorator {

    public Ingredients(Pizza pizza, List<String> extras) {
        super(pizza, extras);
    }

    @Override
    public void prepare() {
        pizza.prepare();
        System.out.println(" - Adding ingredients: " + extras);
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
