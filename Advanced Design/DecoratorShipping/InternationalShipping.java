package DecoratorShipping;

public class InternationalShipping extends ShippingDecorator {
    public InternationalShipping(Shipping decoratedShipping) {
        super(decoratedShipping);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() * 2.5;
    }
}
