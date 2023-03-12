package br.com.cod3r.adapter.notifications;

import br.com.cod3r.adapter.notifications.adapters.NotificationToApiNotificationAdapter;
import br.com.cod3r.adapter.notifications.adapters.NotificationToSMSNotificationAdapter;
import br.com.cod3r.adapter.notifications.interfaces.ApiNotification;
import br.com.cod3r.adapter.notifications.interfaces.SMSNotification;
import br.com.cod3r.adapter.notifications.models.ApiNotificationImpl;
import br.com.cod3r.adapter.notifications.models.EmailNotification;
import br.com.cod3r.adapter.notifications.models.SMSNotificationImpl;

public class Client {
    public static void main(String[] args) {
        EmailNotification notification = new EmailNotification();
        notification.sendNotification("Sending message...");

//        ======================= ADAPTER 1 ==============================
        NotificationToApiNotificationAdapter adapter = new NotificationToApiNotificationAdapter(new ApiNotificationImpl());
        adapter.sendNotification("Testing message notification");

//        ======================= ADAPTER 2 ==============================
        SMSNotification smsNotification = new SMSNotificationImpl();
        NotificationToSMSNotificationAdapter adapterSms = new NotificationToSMSNotificationAdapter(smsNotification);
        adapterSms.setSmsConfiguration("(81)98354-1319");
        adapterSms.sendNotification("Sending SMS message");

    }
}
