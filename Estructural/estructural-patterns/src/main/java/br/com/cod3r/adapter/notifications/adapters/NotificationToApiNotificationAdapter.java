package br.com.cod3r.adapter.notifications.adapters;

import br.com.cod3r.adapter.notifications.interfaces.ApiNotification;
import br.com.cod3r.adapter.notifications.interfaces.Notification;

public class NotificationToApiNotificationAdapter implements Notification {
    private ApiNotification apiNotification;

    public NotificationToApiNotificationAdapter(ApiNotification apiNotification) {
        this.apiNotification = apiNotification;
    }

    @Override
    public void sendNotification(String message) {
        apiNotification.sendNow(message);
    }
}
