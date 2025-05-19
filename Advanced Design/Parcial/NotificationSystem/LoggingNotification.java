package Parcial.NotificationSystem;

public class LoggingNotification extends NotificationDecorator {
    public LoggingNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendMessage(String message) {
        logMessage(message);
        decoratedNotification.sendMessage(message);
    }

    private void logMessage(String message) {
        System.out.println("Logging message: " + message);
    }
}