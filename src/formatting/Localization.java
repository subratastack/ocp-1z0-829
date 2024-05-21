package formatting;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localization {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        ;
        ;
        ;
        ;
        System.out.println(locale);

        System.out.println(Locale.FRANCE);
        System.out.println(Locale.FRENCH);
        System.out.println(new Locale("hi", "IN"));

        // formatting numbers
        double myNum = 1234.5678;
        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(myNum));
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.format(myNum));

        // formatting currency
        double price = 2500254496.32135;
        var usC = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(usC.format(price));
        var ukF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(ukF.format(price));

        // compact number formatting
        var usLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        var usShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(usLong.format(price));
        System.out.println(usShort.format(price));

        // localizing dates and times
        var dtfShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        var dtfMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        var dtfLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        var dtfFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        var frl = Locale.FRANCE;
        var dt = LocalDateTime.of(2023, Month.DECEMBER, 15, 14, 15, 34);

        System.out.println("FormatStyle.SHORT: " + dtfShort.withLocale(frl).format(dt));
        // System.out.println("FormatStyle.MEDIUM: " + dtfLong.withLocale(frl).format(dt));
        System.out.println("FormatStyle.LONG: " + dtfMedium.withLocale(frl).format(dt));
        // System.out.println("FormatStyle.FULL: " + dtfFull.withLocale(frl).format(dt));
        System.out.println(frl.getDisplayName() + "-" + frl.getCountry());

        System.out.println(NumberFormat.getCurrencyInstance(frl).format(price));

        // resource bundle
        var enRb = ResourceBundle.getBundle("Museum", new Locale("en", "US"));
        var itRb = ResourceBundle.getBundle("Museum", Locale.ITALY);

        System.out.println(enRb.getString("greeting") + ", " + enRb.getString("open"));
        System.out.println(itRb.getString("greeting") + ", " + itRb.getString("open"));

        System.out.println(MessageFormat.format(enRb.getString("greetByName"), "Jack", "Mark"));
    }
}
