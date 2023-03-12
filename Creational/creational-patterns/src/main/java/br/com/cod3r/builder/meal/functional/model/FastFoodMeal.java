package br.com.cod3r.builder.meal.functional.model;

public class FastFoodMeal {

    private  String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public String getToy() {
        return gift;
    }

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side="
                + side + ", dessert=" + dessert + ", gift=" + gift + "]";
    }

    public static class Builder {
        private String drink;
        private String main;
        private String side;
        private String dessert;
        private String gift;

		public Builder(String main) {
			this.main = main;
		}
		public Builder withDrink(String drink) {
			this.drink = drink;
			return this;
		}

		public Builder withMain(String main) {
			this.main = main;
			return this;
		}

		public Builder withDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder withGift(String gift) {
			this.gift = gift;
			return this;
		}
		public FastFoodMeal build() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}

    }
}
