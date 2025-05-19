package TelephoneCalls;

import java.util.Map;

public class InternationalRateStrategy implements RateStrategy {
    private Map<String, Double> rates;

    public InternationalRateStrategy(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public double calculateCost(Call call) {
        Double rate = rates.get(call.getDestination());
        if (rate == null) {
            throw new IllegalArgumentException("No international rate for destination: " + call.getDestination());
        }
        return rate * call.getDurationMinutes();
    }
}
