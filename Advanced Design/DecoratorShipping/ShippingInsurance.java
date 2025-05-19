package DecoratorShipping;

public class ShippingInsurance extends ShippingDecorator {
    private static final double INSURANCE_COST = 5.0;

    public ShippingInsurance(Shipping decoratedShipping) {
        super(decoratedShipping);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + INSURANCE_COST;
    }
}
