package streams;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResultsExample {

    public static void main(String[] args) {

        var names = Stream.of("A", "B", "C");
        String result = names.collect(Collectors.joining("-"));
        System.out.println("joining : " + result);

        var names2 = Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        TreeSet<String> treeSet = names2
                .filter(s -> s.endsWith("s"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

        var names3= Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        Map<String, Integer> map = names3.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        var names4= Stream.of("Lewis", "George", "Carlos", "Leclerc", "Norris");
        Map<Integer, String> map1 = names4.collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + ";" + s2, TreeMap::new));
        System.out.println(map1);
        System.out.println(map1.getClass());
        System.out.println(new Boolean("true"));

    }
}
