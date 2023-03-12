package br.com.cod3r.adapter.notifications.models;

import br.com.cod3r.adapter.notifications.interfaces.ApiNotification;

public class ApiNotificationImpl implements ApiNotification {
    @Override
    public void sendNow(String message) {
        System.out.println(message);
    }
}
