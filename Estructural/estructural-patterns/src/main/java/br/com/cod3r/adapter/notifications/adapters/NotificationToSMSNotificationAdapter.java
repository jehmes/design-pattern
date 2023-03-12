package br.com.cod3r.adapter.notifications.adapters;

import br.com.cod3r.adapter.notifications.interfaces.Notification;
import br.com.cod3r.adapter.notifications.interfaces.SMSNotification;

public class NotificationToSMSNotificationAdapter implements Notification {
    private final SMSNotification smsNotification;
    private String number;

    public NotificationToSMSNotificationAdapter(SMSNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    public void setSmsConfiguration(String number) {
        this.number = number;
    }

    @Override
    public void sendNotification(String message) {
        smsNotification.sendSMSNotification(message, number);
    }
}
