package br.com.cod3r.abstractfactory.example4.service;

import br.com.cod3r.abstractfactory.example4.model.CardPayment;
import br.com.cod3r.abstractfactory.example4.model.IPayment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardPaymentService implements IPaymentService {
    @Override
    public IPayment pay() {
        System.out.println("Doing payment");
        return new CardPayment(LocalDateTime.now(), "PIX", new BigDecimal("20"), "987", "164", "Jehmes");
    }
}
