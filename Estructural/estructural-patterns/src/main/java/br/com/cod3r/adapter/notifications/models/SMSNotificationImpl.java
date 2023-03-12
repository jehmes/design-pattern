package br.com.cod3r.adapter.notifications.models;

import br.com.cod3r.adapter.notifications.interfaces.SMSNotification;

public class SMSNotificationImpl implements SMSNotification {
    @Override
    public void sendSMSNotification(String message, String number) {
        System.out.println("Message: " + message + " to number: " + number);
    }
}
