package DecoratorShipping;

public class SpecialPackaging extends ShippingDecorator {
    private static final double COST_PER_KG = 2.0;

    public SpecialPackaging(Shipping decoratedShipping) {
        super(decoratedShipping);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (getWeight() * COST_PER_KG);
    }
}
