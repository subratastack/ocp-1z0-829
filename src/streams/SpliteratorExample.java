package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        Stream<String> streamList = list.stream();

        Spliterator<String> originalSpl = streamList.spliterator();
        Spliterator<String> newSpl = originalSpl.trySplit();

        System.out.println("originalSpl.estimateSize() : " + originalSpl.estimateSize());
        System.out.println("originalSpl.getExactSizeIfKnown() : " + originalSpl.getExactSizeIfKnown());
        originalSpl.forEachRemaining(System.out::println);
        System.out.println("---");
        newSpl.forEachRemaining(System.out::println);
    }
}
