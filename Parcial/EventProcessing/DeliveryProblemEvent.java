package Parcial.EventProcessing;

public class DeliveryProblemEvent {
    private String orderId;
    private String errorCode;
    private String problemDescription;
    private String deliveryAddress;

    public DeliveryProblemEvent(String orderId, String errorCode, String deliveryAddress, String problemDescription) {
        this.orderId = orderId;
        this.errorCode = errorCode;
        this.deliveryAddress = deliveryAddress;
        this.problemDescription = problemDescription;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getErrorCode() {
        return errorCode;
    }
}