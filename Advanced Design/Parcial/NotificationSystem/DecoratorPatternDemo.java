package Parcial.NotificationSystem;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a simple notification
        Notification notification = new BaseNotification();
        notification.sendMessage("Hello, World!");

        // Add SMS functionality
        Notification smsNotification = new SMSNotification(notification);
        smsNotification.sendMessage("Hello, World!");

        // Add Email functionality
        Notification emailNotification = new EmailNotification(notification);
        emailNotification.sendMessage("Hello, World!");

        // Add SMS and Email functionality
        Notification smsEmailNotification = new SMSNotification(new EmailNotification(notification));
        smsEmailNotification.sendMessage("Hello, World!");
        
        // Add Logging functionality
        Notification loggingNotification = new LoggingNotification(notification);
        loggingNotification.sendMessage("Hello, World!");

        // Add Encryption functionality
        Notification encryptedNotification = new EncryptedNotification(notification);
        encryptedNotification.sendMessage("Hello, World!");

        // Add Logging and Encryption functionality
        Notification loggingEncryptedNotification = new LoggingNotification(new EncryptedNotification(notification));
        loggingEncryptedNotification.sendMessage("Hello, World!");
    }
}