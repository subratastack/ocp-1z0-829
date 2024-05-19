package streams;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        // count
        Stream<String> names = Stream.of("A", "B", "C", "D");
        System.out.println("[T] names.count() : " + names.count());

        // min & max
        Stream<String> namesMax = Stream.of("A", "B", "C", "D");
        Optional<String> namesMaxRes = namesMax.max(StreamExample::maxCal);
        System.out.println("[T] namesMax.max(StreamExample::maxCal) : " + namesMaxRes.get());


        Stream<String> namesMin = Stream.of("A", "B", "C", "D");
        Optional<String> namesMinRes = namesMin.min((s1, s2) -> s1.length() - s2.length());
        System.out.print("[T] namesMin.min((s1, s2) -> s1.length() - s2.length()) : ");
        namesMinRes.ifPresent(System.out::println);

        // finding a value, terminates infinite stream
        Stream<String> infNames = Stream.generate(() -> "Subrata");
        infNames.findAny().ifPresent(System.out::println);

        // matching
        var myList = List.of("George", "21", "Ben");
        Stream<String> infMyList = Stream.generate(() -> "Subrata");
        Predicate<String> p = s -> Character.isLetter(s.charAt(0));
        System.out.println(myList.stream().anyMatch(p));
        System.out.println(infMyList.anyMatch(p));

        // reduce
        Stream<String> redNames = Stream.of("S", "u", "b", "r", "a", "t", "a");
        System.out.println(redNames.reduce("", (a, b) -> a + b));

        Stream<Integer> intVals = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(intVals.reduce(0, Integer::sum));

        Stream<Integer> intVals2 = Stream.of(1, 2, 3, 4, 5);
        intVals2.reduce((a, b) -> a * b).ifPresent(System.out::println);

        // when dealing with different types
        Stream<String> diffNames = Stream.of("John", "Adam", "Nick", "George");
        BiFunction<Integer, String, Integer> acc = (i, s) -> {
            System.out.println("i: " + i);
            return i + s.length();
        };
        int len = diffNames.reduce(0, acc, Integer::sum);
        // combiner takes the previous result from the accumulator
        // and combines with the previous result of the combiner
        System.out.println(len);

        // collecting (mutable reduction)
        Stream<String> redNamesCol = Stream.of("S", "u", "b", "r", "a", "t", "a");
        StringBuilder myName = redNamesCol.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println("myName: " + myName);

        // keeping the order in the collection (sorted)
        Stream<String> myStream = Stream.of("S", "u", "b", "r", "a", "t", "a");
        TreeSet<String> mySet = myStream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println(mySet);

        // using collection class
        Stream<String> myStreamCollectionClass = Stream.of("S", "u", "b", "r", "a", "t", "a");
        TreeSet<String> mySetCC = myStreamCollectionClass.collect(
                Collectors.toCollection(TreeSet::new)
        );
        System.out.println(mySetCC);
    }

    private static int maxCal(@NotNull String s1, String s2) {
        return s1.compareTo(s2);
    }
}
