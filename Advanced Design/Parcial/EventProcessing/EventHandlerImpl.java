package Parcial.EventProcessing;

import java.util.ArrayList;

public class EventHandlerImpl implements EventHandler {
    private ArrayList<ReturnEvent> returnEvents;

    public EventHandlerImpl() {
        this.returnEvents = new ArrayList<>();
    }

    public void addReturnEvent(ReturnEvent event) {
        returnEvents.add(event);
        event.approveReturn();
        event.updateInventory();
        event.processRefund();
    }

    public void processAllReturns() {
        for (ReturnEvent event : returnEvents) {
            event.approveReturn();
            event.updateInventory();
            event.processRefund();
        }
    }

    @Override
    public void handle(Object event) {
        if (event instanceof ReturnEvent) {
            addReturnEvent((ReturnEvent) event);
        }
    }
}