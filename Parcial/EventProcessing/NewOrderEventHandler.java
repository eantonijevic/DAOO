package Parcial.EventProcessing;

public class NewOrderEventHandler extends BaseEventHandler<NewOrderEvent> {
    @Override
    protected void handleEvent(NewOrderEvent e) {
        System.out.println("[NewOrder] " + e.getCustomerId());
        System.out.println("[NewOrder] Products: " + e.getProductList());
        e.validateStock();
        e.reserveProducts();
        System.out.println("[NewOrder] Total: " + e.calculateTotal());
        System.out.println("[NewOrder] Payment method: " + e.getPaymentMethod());
        System.out.println("[NewOrder] Delivery address: " + e.getDeliveryAddress());
        System.out.println("[NewOrder] Order processed successfully.");
    }
}
