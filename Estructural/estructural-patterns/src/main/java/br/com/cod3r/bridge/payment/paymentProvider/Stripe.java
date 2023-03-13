package br.com.cod3r.bridge.payment.paymentProvider;

public class Stripe implements PaymentProvider {
    @Override
    public void processPayment(Double value) {
        System.out.println("Processing payment with Stripe, value:" + value);
    }
}
