package br.com.cod3r.adapter.notifications.interfaces;

public interface SMSNotification {
    void sendSMSNotification(String message, String number);
}
