package streams;

import java.util.Optional;

public class OptionalExample {

    public static Optional<Double> average(int... nums) {

        if (nums.length == 0)
            return Optional.empty();

        double sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return Optional.of(sum / nums.length);

    }

    public static void main(String[] args) throws Exception {

        int[] arr1 = new int[]{1, 2, 3, 4 ,5, 6, 7, 8, 9};
        int[] arr2 = new int[10];

        Optional<Double> resArr1 = average(arr1);
        Optional<Double> resArr2 = average();

        resArr1.ifPresent(aDouble -> System.out.println("Average: " + aDouble));
        resArr2.ifPresent(System.out::println);
        resArr2.ifPresentOrElse(System.out::println, () -> System.out.println("No data found."));
        System.out.println(resArr2.orElseGet(Math::random));

        // Throwing exceptions
        /*System.out.println(resArr2.orElseThrow());
        System.out.println(resArr2.orElseThrow(IllegalStateException::new));*/
        // System.out.println(resArr2.get());



    }
}
