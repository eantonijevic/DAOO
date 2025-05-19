package TelephoneCalls;

import java.util.Map;

public class RateStrategyFactory {
    private Map<String, Double> nationalRates;
    private Map<String, Double> internationalRates;

    public RateStrategyFactory(Map<String, Double> nationalRates, Map<String, Double> internationalRates) {
        this.nationalRates = nationalRates;
        this.internationalRates = internationalRates;
    }

    public RateStrategy getStrategy(Call call) {
        switch (call.getType()) {
            case LOCAL:
                return new LocalRateStrategy();
            case NATIONAL:
                return new NationalRateStrategy(nationalRates);
            case INTERNATIONAL:
                return new InternationalRateStrategy(internationalRates);
            default:
                throw new IllegalArgumentException("Unknown call type: " + call.getType());
        }
    }
}
