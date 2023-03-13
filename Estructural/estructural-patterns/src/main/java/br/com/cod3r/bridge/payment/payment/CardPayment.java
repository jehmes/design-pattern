package br.com.cod3r.bridge.payment.payment;

import br.com.cod3r.bridge.payment.paymentProvider.PaymentProvider;

public class CardPayment extends Payment{

    private String cardNumber;

    public CardPayment(double valor, String descricao, PaymentProvider paymentProvider, String cardNumber) {
        super(valor, descricao, paymentProvider);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Begining payment process . . . *Card number: " + cardNumber);
        paymentProvider.processPayment(valor);
    }
}
