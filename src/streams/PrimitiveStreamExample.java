package streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {

    public static void main(String[] args) {

        IntStream is1 = IntStream.of(1, 2, 3, 4, 5);
        OptionalDouble avg = is1.average();
        avg.ifPresent(System.out::println);

        var intStream = IntStream.empty();
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
    }
}
