package br.com.cod3r.factory.example4.service;

import br.com.cod3r.factory.example4.model.IPayment;
import br.com.cod3r.factory.example4.model.PixPayment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PixPaymentService implements IPaymentService {
    @Override
    public IPayment pay() {
        System.out.println("Doing payment");
        return new PixPayment(LocalDateTime.now(), "PIX", new BigDecimal("20"), "123", "descrição");
    }
}
