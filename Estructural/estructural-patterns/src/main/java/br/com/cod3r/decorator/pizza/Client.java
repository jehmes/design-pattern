package br.com.cod3r.decorator.pizza;

import br.com.cod3r.decorator.pizza.decorator.PizzaDecorator;
import br.com.cod3r.decorator.pizza.decorator.Ingredients;
import br.com.cod3r.decorator.pizza.decorator.Topping;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Pizza largePizza = new LargePizza();

        PizzaDecorator pizzaWithIngredients = new Ingredients(largePizza, Arrays.asList("Pepperoni", "Mozzarella"));
        PizzaDecorator pizzaWithToppingAndIngredients = new Topping(pizzaWithIngredients, Arrays.asList("Tomate sauce, Cheese"));
        pizzaWithToppingAndIngredients.prepare();
        pizzaWithToppingAndIngredients.bake();
        pizzaWithToppingAndIngredients.order();
    }
}
