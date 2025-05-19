package DecoratorShipping;

public abstract class ShippingDecorator implements Shipping {
    protected Shipping decoratedShipping;

    public ShippingDecorator(Shipping decoratedShipping) {
        this.decoratedShipping = decoratedShipping;
    }

    @Override
    public double getWeight() {
        return decoratedShipping.getWeight();
    }

    @Override
    public double calculateCost() {
        return decoratedShipping.calculateCost();
    }
}
