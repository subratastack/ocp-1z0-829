package interfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> gt10 = n -> n > 10;
        System.out.println(gt10.test(5));
        System.out.println(gt10.test(12));
    }
}
