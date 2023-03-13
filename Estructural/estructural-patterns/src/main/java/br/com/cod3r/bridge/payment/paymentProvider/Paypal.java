package br.com.cod3r.bridge.payment.paymentProvider;

public class Paypal implements PaymentProvider {
    @Override
    public void processPayment(Double value) {
        System.out.println("Processing payment with Paypal, value:" + value);
    }
}
