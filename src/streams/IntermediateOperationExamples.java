package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationExamples {

    public static void main(String[] args) {

        // filtering
        System.out.println("filtering");
        Stream<String> names1 = Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        names1.filter(s -> s.endsWith("s")).forEach(System.out::println);

        // removing duplicates
        System.out.println("removing duplicates");
        Stream<String> names2 = Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris", "George", "Leclerc");
        names2.distinct().forEach(System.out::println);

        // restricting by position
        System.out.println("restricting by position");
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1);
        numbers.skip(3)
                .limit(5)
                .forEach(System.out::println);

        // mapping using map()
        System.out.println("mapping using map()");
        Stream<String> names3 = Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        names3.map(
                item -> item + "-hello"
        ).forEach(System.out::println);

        // mapping using flatMap()
        System.out.println("mapping using flatMap()");
        List<String> zero = List.of();
        List<String> two = List.of("Lewis", "George");
        List<String> three = List.of("Carlos", "Leclerc", "Norris");
        Stream<List<String>> combinedLists = Stream.of(zero, two, three);
        combinedLists.flatMap(Collection::stream).forEach(System.out::println);

        // sorting
        System.out.println("sorting using sorted()");
        Stream<String> names4 = Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris", "George", "Leclerc");
        // names4.sorted(Comparator.naturalOrder()).forEach(System.out::println);
        names4.sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);

        System.out.println("\n\n EXAMPLES \n\n");

        // EXAMPLES
        /*
        For the given list of names get first two names which are
        greater than 5 characters long, in alphabetical order
        * */
        List<String> exNames1 = List.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        exNames1.stream()
                .filter((s) -> s.length() > 5)
                .sorted(Comparator.naturalOrder())
                .limit(2)
                .forEach(System.out::println);

        Map<String, Integer[]> originalMap = new HashMap<>();
        originalMap.put("A", new Integer[]{1, 2, 3});
        originalMap.put("B", new Integer[]{1, 4});
        originalMap.put("C", new Integer[]{2, 3});
        originalMap.put("D", new Integer[]{2, 4});

        /*
        * 1 -> A, B
        * 2 -> A, C, D
        * 3 -> A, C
        * 4 -> B, D
        * */

        originalMap.entrySet().stream()
                .flatMap(entry -> Arrays.stream(entry.getValue())
                        .map(value -> new AbstractMap.SimpleEntry<>(value, entry.getKey())))
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
                .forEach((k, v) -> System.out.println(k + "->" + v));


    }
}
