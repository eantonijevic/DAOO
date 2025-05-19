package TelephoneCalls;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> natRates = new HashMap<>();
        natRates.put("CityA", 0.25);
        natRates.put("CityB", 0.30);

        Map<String, Double> intlRates = new HashMap<>();
        intlRates.put("US", 0.50);
        intlRates.put("UK", 0.60);

        RateStrategyFactory factory = new RateStrategyFactory(natRates, intlRates);

        List<Call> calls = List.of(
                new Call(CallType.LOCAL, LocalDateTime.of(2025, 5, 10, 9, 30), 10, ""),
                new Call(CallType.INTERNATIONAL, LocalDateTime.of(2025, 5, 11, 14, 0), 5, "US"),
                new Call(CallType.NATIONAL, LocalDateTime.of(2025, 5, 12, 20, 15), 15, "CityA")
        );

        Invoice invoice = new Invoice("cust123", YearMonth.of(2025, 5), 15.00, calls, factory);
        invoice.printStatement();
    }
}
