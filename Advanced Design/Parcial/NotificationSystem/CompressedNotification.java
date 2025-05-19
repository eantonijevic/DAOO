package Parcial.NotificationSystem;

public class CompressedNotification extends NotificationDecorator {
    public CompressedNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendMessage(String message) {
        String compressedMessage = compress(message);
        decoratedNotification.sendMessage(compressedMessage);
    }

    private String compress(String message) {
        // Simple compression logic (for demonstration purposes)
        return message.replaceAll(" ", "");
    }
}