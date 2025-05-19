package Parcial.EventProcessing;

public class PaymentReceivedEvent {
    private String orderId;
    private double amount;
    private String paymentMethod;
    private String date;
    private String transactionId;

    public PaymentReceivedEvent(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() { return orderId; }
    public double getAmount()    { return amount;   }
    public String getPaymentMethod() { return paymentMethod; }
    public String getDate() { return date; }
    public String getTransactionId() { return transactionId; }

    public void verifyAmount(double amt) {
        if (amt <= 0) throw new IllegalArgumentException("Invalid amount");
        System.out.println("Amount verified: " + amt);
    }

    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Order " + orderId + " status → " + status);
    }

    public void issueInvoice(String orderId, double amt) {
        System.out.println("Issuing invoice for " + orderId + ": $" + amt);
    }
}