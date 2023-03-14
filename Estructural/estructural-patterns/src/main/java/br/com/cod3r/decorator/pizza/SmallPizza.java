package br.com.cod3r.decorator.pizza;

public class SmallPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("- Preparing a small pizza");
    }
    @Override
    public void bake() {
        System.out.println("- Baking a pizza into small furnace");
    }
    @Override
    public void order() {
        System.out.println("- Delivering pizza in the a small package");
    }
}
