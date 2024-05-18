package collections;

import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map1 = Map.of(1, "A", 2, "B", 3, "C");
        System.out.println(map1);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "X"),
                Map.entry(2, "Y"),
                Map.entry(3, "Z")
        );
        System.out.println(map2);
    }
}
