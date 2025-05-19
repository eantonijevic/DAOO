package Parcial.EventProcessing;

public class OrderCancelledEvent {
    private String orderId;
    private String reason;
    private String requester;

    public OrderCancelledEvent(String orderId, String reason, String requester) {
        this.orderId = orderId;
        this.reason = reason;
        this.requester = requester;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getReason() {
        return reason;
    }

    public String getRequester() {
        return requester;
    }

    public boolean verifyIfCancellable() {
        // Logic to verify if the order can be cancelled
        // For example, check if the order is already shipped or delivered
        return true; // Placeholder for actual logic
    }

    public void releaseStock() {
        // Logic to release the stock of the cancelled order
        // For example, update the inventory system to reflect the cancellation
        System.out.println("Releasing stock for order: " + orderId);
    }

    public void processRefundIfApplicable() {
        // Logic to process a refund if applicable
        // For example, check if the payment was made and initiate a refund
        System.out.println("Processing refund for order: " + orderId);
    }
}