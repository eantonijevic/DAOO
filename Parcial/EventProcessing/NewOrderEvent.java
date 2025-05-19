package Parcial.EventProcessing;

import java.util.List;

public class NewOrderEvent {
    private String customerId;
    private List<String> productList;
    private String deliveryAddress;
    private String paymentMethod;

    public NewOrderEvent(String customerId, List<String> productList,
                         String deliveryAddress, String paymentMethod) {
        this.customerId = customerId;
        this.productList = productList;
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getProductList() {
        return productList;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void validateStock() {
        for (String product : productList) {
            if (!isProductInStock(product)) {
                throw new IllegalArgumentException("Out of stock: " + product);
            }
        }
        System.out.println("Stock OK for: " + productList);
    }
    private boolean isProductInStock(String p) { return true; }

    public void reserveProducts() {
        for (String p : productList) {
            System.out.println("Reserving product: " + p);
        }
    }

    public double calculateTotal() {
        double sum = 0;
        for (String p : productList) sum += getProductPrice(p);
        return sum;
    }
    private double getProductPrice(String p) { return 10.0; }
}
