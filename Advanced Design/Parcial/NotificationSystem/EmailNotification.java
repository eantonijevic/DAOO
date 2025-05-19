package Parcial.NotificationSystem;

public class EmailNotification extends NotificationDecorator {
    public EmailNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendMessage(String message) {
        String emailMessage = formatAsEmail(message);
        decoratedNotification.sendMessage(emailMessage);
    }

    private String formatAsEmail(String message) {
        // Simple email formatting logic (for demonstration purposes)
        return "Subject: Notification\n\n" + message;
    }
}