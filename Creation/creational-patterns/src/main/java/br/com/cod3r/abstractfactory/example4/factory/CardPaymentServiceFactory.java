package br.com.cod3r.abstractfactory.example4.factory;

import br.com.cod3r.abstractfactory.example4.model.IPayment;
import br.com.cod3r.abstractfactory.example4.service.CardPaymentService;

public class CardPaymentServiceFactory extends IPaymentServiceFactory {
    @Override
    public IPayment executePayment() {
        return new CardPaymentService().pay();
    }
}
