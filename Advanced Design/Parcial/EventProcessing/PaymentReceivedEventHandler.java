package Parcial.EventProcessing;

public class PaymentReceivedEventHandler extends BaseEventHandler<PaymentReceivedEvent> {
    @Override
    protected void handleEvent(PaymentReceivedEvent e) {
        System.out.println("[PaymentReceived] for order " + e.getOrderId() + "transactionId: " + e.getTransactionId());
        System.out.println("[PaymentReceived] Date: " + e.getDate()); 
        System.out.println("[PaymentReceived] Payment method: " + e.getPaymentMethod());
        System.out.println("[PaymentReceived] Verifying amount: " + e.getAmount());
        e.verifyAmount(e.getAmount());
        System.out.println("[PaymentReceived] Updating order status");
        e.updateOrderStatus(e.getOrderId(), "Paid");
        System.out.println("[PaymentReceived] Issuing invoice");
        e.issueInvoice(e.getOrderId(), e.getAmount());
    }
}