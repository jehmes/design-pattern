package br.com.cod3r.abstractfactory.example4.factory;

import br.com.cod3r.abstractfactory.example4.model.IPayment;

public abstract class IPaymentServiceFactory {

    public IPayment create() {
        IPayment payment = null;
        payment = executePayment();
        return payment;
    }
    protected abstract IPayment executePayment();
}
