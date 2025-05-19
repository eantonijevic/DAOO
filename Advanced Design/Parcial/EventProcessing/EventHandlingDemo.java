package Parcial.EventProcessing;

import java.util.List;

public class EventHandlingDemo {
    public static void main(String[] args) {
        BaseEventHandler<?> chain = new NewOrderEventHandler();
        chain.setNext(new PaymentReceivedEventHandler())
                .setNext(new OrderCancelledEventHandler())
                .handle(new ReturnEventHandler());

    NewOrderEvent    newOrder = new NewOrderEvent("cust1",
                                      List.of("p1","p2"),
                                      "123 Main St","CreditCard");
        PaymentReceivedEvent payment = new PaymentReceivedEvent("order1",  49.99);
        OrderCancelledEvent  cancel  = new OrderCancelledEvent("order1",
                                      "Customer changed their mind", "System");
        ReturnEvent          ret     = new ReturnEvent("order1",
                                      List.of("p2"), "Damaged","Inspect");

        System.out.println("=== NewOrderEvent ===");
        chain.handle(newOrder);
        System.out.println();

        System.out.println("=== PaymentReceivedEvent ===");
        chain.handle(payment);
        System.out.println();

        System.out.println("=== OrderCancelledEvent ===");
        chain.handle(cancel);
        System.out.println();

        System.out.println("=== ReturnEvent ===");
        chain.handle(ret);
    }
}