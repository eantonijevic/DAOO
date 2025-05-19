package TelephoneCalls;

import java.time.YearMonth;
import java.util.List;

public class Invoice {
    private String customerId;
    private YearMonth month;
    private double subscriptionFee;
    private List<Call> calls;
    private RateStrategyFactory factory;

    public Invoice(String customerId, YearMonth month, double subscriptionFee,
                   List<Call> calls, RateStrategyFactory factory) {
        this.customerId = customerId;
        this.month = month;
        this.subscriptionFee = subscriptionFee;
        this.calls = calls;
        this.factory = factory;
    }

    public double total() {
        double sum = subscriptionFee;
        for (Call c : calls) {
            RateStrategy rs = factory.getStrategy(c);
            sum += rs.calculateCost(c);
        }
        return sum;
    }

    public void printStatement() {
        System.out.println("Invoice for " + customerId + " – " + month);
        System.out.println("Subscription: " + subscriptionFee);
        for (Call c : calls) {
            RateStrategy rs = factory.getStrategy(c);
            System.out.printf("%s: %.2f\n", c, rs.calculateCost(c));
        }
        System.out.println("Total: " + total());
    }
}
