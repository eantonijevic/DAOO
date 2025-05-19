package DecoratorShipping;

public class BaseShipping implements Shipping {
    private double weight;
    private static final double RATE_PER_KG = 3.0; // base rate per kg

    public BaseShipping(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateCost() {
        return weight * RATE_PER_KG;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
