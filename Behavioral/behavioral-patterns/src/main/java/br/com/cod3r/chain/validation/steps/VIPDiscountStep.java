package br.com.cod3r.chain.validation.steps;

public class VIPDiscountStep extends ProcessStep {

    private final static double DISCOUNT_PERCENTAGE = 0.2;

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price;
        if (price > 100) {
            discountedPrice = price * DISCOUNT_PERCENTAGE;
        }
        if (nextStep != null) {
            return nextStep.applyDiscount(discountedPrice);
        } else {
            return discountedPrice;
        }
    }
}
