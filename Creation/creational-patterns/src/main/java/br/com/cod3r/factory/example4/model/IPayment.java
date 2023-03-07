package br.com.cod3r.factory.example4.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class IPayment {

    private LocalDateTime paymentDate;
    private String paymentMethod;
    private BigDecimal amount;

    public IPayment() {
    }

    public IPayment(LocalDateTime paymentDate, String paymentMethod, BigDecimal amount) {
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "paymentDate=" + paymentDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
