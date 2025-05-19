package Parcial.NotificationSystem;

public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    @Override
    public void sendMessage(String message) {
        decoratedNotification.sendMessage(message);
    }
}