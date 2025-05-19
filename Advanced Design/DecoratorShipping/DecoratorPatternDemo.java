package DecoratorShipping;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Base shipping with weight 10kg
        Shipping shipping = new BaseShipping(10);
        System.out.println("Base cost: €" + shipping.calculateCost());

        shipping = new ExpressShipping(shipping);
        System.out.println("Express Shipping cost: €" + shipping.calculateCost());

        shipping = new ShippingInsurance(shipping);
        System.out.println("With Insurance cost: €" + shipping.calculateCost());

        shipping = new SpecialPackaging(shipping);
        System.out.println("With Special Packaging cost: €" + shipping.calculateCost());

        shipping = new InternationalShipping(shipping);
        System.out.println("International Shipping cost: €" + shipping.calculateCost());
    }
}
