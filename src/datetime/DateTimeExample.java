package datetime;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class DateTimeExample {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        // creating local date
        System.out.println(LocalDate.of(2024, Month.APRIL, 1));
        System.out.println(LocalDate.of(2023, 11, 14));

        // creating local time
        System.out.println(LocalTime.of(21, 38));
        System.out.println(LocalTime.of(23, 40, 15));
        System.out.println(LocalTime.of(8, 52, 15, 144));

        // creating zoned date-time
        ZoneId zone = ZoneId.of("Asia/Singapore");
        System.out.println(ZonedDateTime.of(2024, 4, 23, 11, 55, 12, 145, zone));

        // isBefore(), isAfter()
        System.out.println("isBefore: " + LocalDate.of(2023, Month.AUGUST, 12).isBefore(LocalDate.now()));
        System.out.println("isAfter: " + LocalDate.of(2023, Month.AUGUST, 12).isAfter(LocalDate.now()));

        // date and time classes are immutable
        LocalDate date = LocalDate.now();
        date.plusMonths(2);
        System.out.println(date);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.EPOCH);

        System.out.println(LocalDateTime.now().getSecond());
        // System.out.println(LocalDate.of(2020, 9, 31));
        char var  = '7';
        System.out.println(var);

        LocalDate date2 = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date2.atTime(time));

        System.out.println(LocalDate.parse("2018-07-11"));

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);

    }

}
