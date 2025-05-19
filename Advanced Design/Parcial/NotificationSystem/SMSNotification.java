package Parcial.NotificationSystem;

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendMessage(String message) {
        sendSMS(message);
        decoratedNotification.sendMessage(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}