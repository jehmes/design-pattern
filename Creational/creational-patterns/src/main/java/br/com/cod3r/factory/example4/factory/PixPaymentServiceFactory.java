package br.com.cod3r.factory.example4.factory;

import br.com.cod3r.factory.example4.model.IPayment;
import br.com.cod3r.factory.example4.service.PixPaymentService;

public class PixPaymentServiceFactory extends IPaymentServiceFactory {
    @Override
    public IPayment executePayment() {
        return new PixPaymentService().pay();
    }
}
