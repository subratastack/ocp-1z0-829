package interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Printer {

    public static void printOne(String a) {
        System.out.println(a);
    }

    public static void printTwo(String a, String b) {
        System.out.println(a + b);
    }
}

public class ConsumerInterfaceExample {

    public static void main(String[] args) {

        Consumer<String> ci1 = Printer::printOne;
        // ci1.accept("hello");

        BiConsumer<String, String> bCi = Printer::printTwo;
        bCi.accept("Hello", "World");

        Consumer<String> ci2 = (s) -> System.out.println( s + "world");

        Consumer<String> combined = ci1.andThen(ci2);
        combined.accept("hello");
    }
}
