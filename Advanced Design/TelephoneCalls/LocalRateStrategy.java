package TelephoneCalls;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalRateStrategy implements RateStrategy {
    @Override
    public double calculateCost(Call call) {
        LocalDateTime start = call.getStart();
        DayOfWeek dow = start.getDayOfWeek();
        int hour = start.getHour();
        double rate;
        boolean weekend = (dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY);
        if (!weekend && hour >= 8 && hour < 20) {
            rate = 0.20;
        } else {
            rate = 0.10;
        }
        return rate * call.getDurationMinutes();
    }
}
