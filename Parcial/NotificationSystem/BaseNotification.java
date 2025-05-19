package Parcial.NotificationSystem;

public class BaseNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
