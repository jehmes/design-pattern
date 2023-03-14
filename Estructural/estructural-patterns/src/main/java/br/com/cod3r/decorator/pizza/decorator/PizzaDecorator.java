package br.com.cod3r.decorator.pizza.decorator;

import br.com.cod3r.decorator.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaDecorator implements Pizza{
    Pizza pizza;
    List<String> extras;
    protected PizzaDecorator(Pizza pizza, List<String> extras) {
        this.pizza = pizza;
        this.extras = extras;
    }
}
