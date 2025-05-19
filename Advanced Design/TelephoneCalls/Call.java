package TelephoneCalls;

import java.time.LocalDateTime;

public class Call {
    private CallType type;
    private LocalDateTime start;
    private int durationMinutes;
    private String destination;

    public Call(CallType type, LocalDateTime start, int durationMinutes, String destination) {
        this.type = type;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.destination = destination;
    }

    public CallType getType() { return type; }
    public LocalDateTime getStart() { return start; }
    public int getDurationMinutes() { return durationMinutes; }
    public String getDestination() { return destination; }

    @Override
    public String toString() {
        return type + " call to " + destination + " (" + durationMinutes + " mins at " + start + ")";
    }
}
