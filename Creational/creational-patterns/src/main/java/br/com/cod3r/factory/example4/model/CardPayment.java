package br.com.cod3r.factory.example4.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardPayment extends IPayment {

    private String cardNumber;
    private String cvv;
    private String holderName;

    public CardPayment() {
    }

    public CardPayment(String cardNumber, String cvv, String holderName) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.holderName = holderName;
    }

    public CardPayment(LocalDateTime paymentDate, String paymentMethod, BigDecimal amount, String cardNumber, String cvv, String holderName) {
        super(paymentDate, paymentMethod, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", holderName='" + holderName + '\'' +
                " " + super.toString();
    }
}
