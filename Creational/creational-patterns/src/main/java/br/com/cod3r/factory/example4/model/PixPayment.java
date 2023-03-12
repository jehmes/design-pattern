package br.com.cod3r.factory.example4.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PixPayment extends IPayment{

    private String pixKey;
    private String description;

    public PixPayment() {
    }

    public PixPayment(String pixKey, String description) {
        this.pixKey = pixKey;
        this.description = description;
    }

    public PixPayment(LocalDateTime paymentDate, String paymentMethod, BigDecimal amount, String pixKey, String description) {
        super(paymentDate, paymentMethod, amount);
        this.pixKey = pixKey;
        this.description = description;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "pixKey='" + pixKey + '\'' +
                ", description='" + description + '\'' +
                " " + super.toString();
    }
}
