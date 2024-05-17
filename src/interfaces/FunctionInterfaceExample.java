package interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

class Calculator2 {

    public static double square(int n) {
        return (double) (n * n);
    }

    public static String concatenation(String a, int b) {
        return a + b;
    }
}

public class FunctionInterfaceExample {

    public static void main(String[] args) {
        Function<Integer, Double> fn = Calculator2::square;
        System.out.println(fn.apply(2));

        BiFunction<String, Integer,  String> bFn = Calculator2::concatenation;
        System.out.println(bFn.apply("a", 1));
    }
}
