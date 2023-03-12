package br.com.cod3r.adapter.notifications.models;

import br.com.cod3r.adapter.notifications.interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.printf("Message: %s \n", message);
    }
}
