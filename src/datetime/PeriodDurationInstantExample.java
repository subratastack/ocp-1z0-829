package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDurationInstantExample {

    public static void main(String[] args) throws InterruptedException {
        // Period can only be used with LocalDate and LocalDateTime
        Period p1 = Period.ofYears(2);
        System.out.println(p1);

        Period p2 = Period.ofWeeks(2);
        System.out.println(p2);

        Period p3 = Period.ofDays(10);
        System.out.println(p3);

        System.out.println(Period.of(2023, 4, 14));

        System.out.println(LocalDate.now().plus(p3));

        // Duration can be only be used with LocalTime and LocalDateTime

        Duration d1 = Duration.ofDays(5);
        System.out.println(d1);

        System.out.println(LocalDateTime.now().plus(d1));


        Duration d2 = Duration.ofHours(7);
        System.out.println(d2);

        System.out.println(LocalDateTime.now().plus(d2));

        // chronounits

        Duration c1 = Duration.of(3, ChronoUnit.HALF_DAYS);
        System.out.println(c1);

        System.out.println(ChronoUnit.HOURS.between(LocalTime.now(), LocalTime.now().plusHours(3)));
        System.out.println(ChronoUnit.HOURS.between(LocalTime.now().plusHours(6), LocalTime.now()));

        // Tnstant (uses EPOCH time since 1970-01-01T00:00:00z)
        Instant now = Instant.now();
        System.out.println(now);

        // Duration calculation

        Instant t1 = Instant.now();

        Thread.sleep(3000);

        Instant t2 = Instant.now();

        System.out.println(Duration.between(t1, t2).toSeconds());
    }

}
