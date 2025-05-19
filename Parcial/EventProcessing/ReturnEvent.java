package Parcial.EventProcessing;

import java.util.List;

public class ReturnEvent {
    public String orderId;
    public List<String> returnedProducts;
    public String reason;
    public String productStatus;

    public ReturnEvent(String orderId, List<String> returnedProducts, String reason, String productStatus) {
        this.orderId = orderId;
        this.returnedProducts = returnedProducts;
        this.reason = reason;
        this.productStatus = productStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getReturnedProducts() {
        return returnedProducts;
    }

    public String getReason() {
        return reason;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void approveReturn() {
        // Logic to approve the return
        System.out.println("Return approved for order: " + orderId);
    }

    public void updateInventory() {
        // Logic to update inventory based on the returned products
        for (String product : returnedProducts) {
            System.out.println("Updating inventory for product: " + product);
        }
    }

    public void processRefund() {
        // Logic to process a refund for the returned products
        System.out.println("Processing refund for order: " + orderId);
    }
}
