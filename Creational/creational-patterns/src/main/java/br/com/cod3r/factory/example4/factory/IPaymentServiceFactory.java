package br.com.cod3r.factory.example4.factory;

import br.com.cod3r.factory.example4.model.IPayment;

public abstract class IPaymentServiceFactory {

    public IPayment create() {
        IPayment payment = null;
        payment = executePayment();
        return payment;
    }
    protected abstract IPayment executePayment();
}
