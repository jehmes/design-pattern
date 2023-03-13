package br.com.cod3r.bridge.payment.payment;

import br.com.cod3r.bridge.payment.paymentProvider.PaymentProvider;

public class PIXPayment extends Payment {

    private String pixKey;

    public PIXPayment(double valor, String descricao, PaymentProvider paymentProvider, String pixKey) {
        super(valor, descricao, paymentProvider);
        this.pixKey = pixKey;
    }

    @Override
    public void pay() {
        System.out.println("Begining payment process . . . *PIX key: " + pixKey);
        paymentProvider.processPayment(valor);
    }
}
