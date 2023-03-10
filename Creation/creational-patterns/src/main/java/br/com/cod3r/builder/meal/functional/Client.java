package br.com.cod3r.builder.meal.functional;


import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {

		FastFoodMeal meal = new FastFoodMeal.Builder("T-Bone")
				.withDrink("Drink 2")
				.withDessert("Petit Gateau")
				.build();
		System.out.println(meal);

	}
}