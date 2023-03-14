package br.com.cod3r.decorator.pizza;

public class LargePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("- Preparing a large pizza");
    }
    @Override
    public void bake() {
        System.out.println("- Baking a pizza into large furnace");
    }
    @Override
    public void order() {
        System.out.println("- Delivering pizza in the a large package");
    }
}
