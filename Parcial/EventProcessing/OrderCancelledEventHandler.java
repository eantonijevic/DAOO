package Parcial.EventProcessing;

public class OrderCancelledEventHandler extends BaseEventHandler<OrderCancelledEvent> {
    @Override
    protected void handleEvent(OrderCancelledEvent e) {
        if (e.verifyIfCancellable()){
            System.out.println("[OrderCancelled] " + e.getOrderId() + "for reason" + e.getReason());
            e.releaseStock();
            e.processRefundIfApplicable();
        } else {
            System.out.println("[OrderCancelled] Order cannot be cancelled for order: " + e.getOrderId());
        }
    }
}