package formatting;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class NumberFormatting {

    public static void main(String[] args) {

        double num = 12345.6789;

        NumberFormat f1 = new DecimalFormat("###,###, ###.0");
        System.out.println(f1.format(num));

        NumberFormat f2 = new DecimalFormat("00,00,00.00000");
        System.out.println(f2.format(num));

        NumberFormat f3 = new DecimalFormat("$###,###.######");
        System.out.println(f3.format(num));

        System.out.println("+-".repeat(30));

        LocalDate date = LocalDate.of(2023, Month.MARCH, 15);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getChronology());
        System.out.println(date.getMonth());

        LocalTime time = LocalTime.of(9, 45, 23);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        System.out.println("ISO_LOCAL_DATE: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_LOCAL_TIME: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        // System.out.println("Formatting time with ISO_LOCAL_DATE_TIME" + time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println(DateTimeFormatter.ofPattern("'Date:' dd.MM.yy, ' | Time: ' hh:mm:ss a").format(dateTime));
    }
}
