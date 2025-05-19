package TelephoneCalls;

import java.util.Map;

public class NationalRateStrategy implements RateStrategy {
    private Map<String, Double> rates;

    public NationalRateStrategy(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public double calculateCost(Call call) {
        Double rate = rates.get(call.getDestination());
        if (rate == null) {
            throw new IllegalArgumentException("No national rate for destination: " + call.getDestination());
        }
        return rate * call.getDurationMinutes();
    }
}
