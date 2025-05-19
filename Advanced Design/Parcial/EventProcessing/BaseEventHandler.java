package Parcial.EventProcessing;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseEventHandler<T> implements EventHandler {
    private BaseEventHandler<?> next;
    private Class<T> eventType;

    @SuppressWarnings("unchecked")
    public BaseEventHandler() {
        Type sup = getClass().getGenericSuperclass();
        if (sup instanceof ParameterizedType) {
            this.eventType = (Class<T>) 
                ((ParameterizedType) sup).getActualTypeArguments()[0];
        } else {
            throw new IllegalArgumentException("BaseEventHandler must be parameterized with a type");
        }
    }

    public BaseEventHandler<?> setNext(BaseEventHandler<?> nxt) {
        this.next = nxt;
        return nxt;
    }

    @Override
    public final void handle(Object event) {
        if (eventType.isInstance(event)) {
            handleEvent(eventType.cast(event));
        } else if (next != null) {
            next.handle(event);
        } else {
            System.out.println("No handler found for event type: " + event.getClass().getName());
        }
    }

    protected abstract void handleEvent(T event);
}