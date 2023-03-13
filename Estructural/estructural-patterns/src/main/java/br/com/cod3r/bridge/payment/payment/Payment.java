package br.com.cod3r.bridge.payment.payment;

import br.com.cod3r.bridge.payment.paymentProvider.PaymentProvider;

public abstract class Payment {
    protected Double valor;
    protected String descricao;
    protected PaymentProvider paymentProvider;

    public Payment(double valor, String descricao, PaymentProvider paymentProvider) {
        this.valor = valor;
        this.descricao = descricao;
        this.paymentProvider = paymentProvider;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public abstract void pay();
}
