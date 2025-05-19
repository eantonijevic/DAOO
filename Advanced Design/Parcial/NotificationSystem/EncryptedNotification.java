package Parcial.NotificationSystem;

public class EncryptedNotification extends NotificationDecorator {
    public EncryptedNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendMessage(String message) {
        String encryptedMessage = encrypt(message);
        decoratedNotification.sendMessage(encryptedMessage);
    }

    private String encrypt(String message) {
        // Simple encryption logic (for demonstration purposes)
        return new StringBuilder(message).reverse().toString();
    }
}