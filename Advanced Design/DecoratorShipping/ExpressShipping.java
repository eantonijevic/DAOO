package DecoratorShipping;

public class ExpressShipping extends ShippingDecorator {
    public ExpressShipping(Shipping decoratedShipping) {
        super(decoratedShipping);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() * 1.5; // increase cost by 50%
    }
}
