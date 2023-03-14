package br.com.cod3r.decorator.coffeeShop;

import br.com.cod3r.decorator.coffeeShop.model.Drink;
import br.com.cod3r.decorator.coffeeShop.model.Expresso;
import br.com.cod3r.decorator.coffeeShop.model.Tea;
import br.com.cod3r.decorator.coffeeShop.model.decorators.Chocolate;
import br.com.cod3r.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.cod3r.decorator.coffeeShop.model.decorators.DrinkDecorator;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		DrinkDecorator expressoDoubleDrink = new DoubleDrink(new Expresso());
		DrinkDecorator expressoChocolate = new Chocolate(new Expresso());

		DrinkDecorator doubleTeaWithChocolate = new Chocolate(new DoubleDrink(new Tea()));

		order("Expresso", new Expresso());
		order("Tea", new Tea());

		order("Expresso Doubledrink", expressoDoubleDrink);
		order("Expresso Chocolate", expressoChocolate);
		order("Double tea with chocolate", doubleTeaWithChocolate);
	}
}
