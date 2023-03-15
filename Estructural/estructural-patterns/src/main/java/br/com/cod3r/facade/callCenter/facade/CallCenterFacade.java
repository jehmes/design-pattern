package br.com.cod3r.facade.callCenter.facade;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.*;

import java.util.List;

public class CallCenterFacade {
    CardService cardService;
    RegisterService registerService;
    ReportService reportService;
    PaymentService paymentService;
    SecurityService securityService;


    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public Card getCardByUser(Long number) {
        return cardService.getCardByUser(number);
    }

    public void getSumary(Card card) {
        reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public List<Register> getRegistersByCard(Card card) {
        return registerService.getRegistersByCard(card);
    }

    public void removeByIndex(Card card, int i) {
        registerService.removeByIndex(card, i);
    }

    public List<Register> blockCard(Card card) {
        return securityService.blockCard(card);
    }

    public Card createNewCard(Long user, Long cardNumber) {
        return cardService.createNewCard(user, cardNumber);
    }

    public void addCardRegisters(Card card, List<Register> registers) {
        registerService.addCardRegisters(card, registers);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = getRegistersByCard(card);
        removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = blockCard(card);
        Card newCard = createNewCard(123456L, 33445566L);
        addCardRegisters(newCard, pendingRegisters);
        getSumary(newCard);
    }
}
