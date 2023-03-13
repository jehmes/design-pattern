package br.com.cod3r.bridge.payment;

import br.com.cod3r.bridge.payment.payment.CardPayment;
import br.com.cod3r.bridge.payment.payment.PIXPayment;
import br.com.cod3r.bridge.payment.payment.Payment;
import br.com.cod3r.bridge.payment.paymentProvider.PaymentProvider;
import br.com.cod3r.bridge.payment.paymentProvider.Paypal;
import br.com.cod3r.bridge.payment.paymentProvider.Stripe;

public class Client {
    public static void main(String[] args) {
        PaymentProvider paypalProvider = new Paypal();
        PaymentProvider stripeProvider = new Stripe();

        Payment cardPaymentWithPaypal = new CardPayment(420d, "Móveis", paypalProvider, "123456");
        cardPaymentWithPaypal.pay();

        System.out.println("=================================================================");

        Payment cardPaymentWithStripe = new CardPayment(420d, "Móveis", stripeProvider, "123456");
        cardPaymentWithStripe.pay();

        System.out.println("\n==============================================================================\n");

        Payment pixPaymentWithStripe = new PIXPayment(230d, "Roupas", stripeProvider, "4044lpoj4ihgyug4");
        pixPaymentWithStripe.pay();

        System.out.println("=================================================================");

        Payment pixPaymentWithPaypal = new PIXPayment(230d, "Roupas", paypalProvider, "4044lpoj4ihgyug4");
        pixPaymentWithPaypal.pay();
    }
}
