package Parcial.EventProcessing;

public class ReturnEventHandler extends BaseEventHandler<ReturnEvent> {
    @Override
    protected void handleEvent(ReturnEvent e) {
        System.out.println("[Return] Order ID: " + e.getOrderId());
        System.out.println("[Return] Reason: " + e.getReason());
        System.out.println("[Return] Processing return for order ID: " + e.getOrderId());
        System.out.println("[Return] Returned products: " + e.getReturnedProducts());
        System.out.println("[Return] Product status: " + e.getProductStatus());
        e.approveReturn();
        e.updateInventory();
        e.processRefund();
        System.out.println("[Return] Return processed successfully.");
    }
}
