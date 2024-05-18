package methods;

public class BoxingUnBoxing {

    public static void main(String[] args) {

        int a = 3;
        // boxing
        Integer boxA = Integer.valueOf(a);
        // unboxing
        int unBoxA = boxA.intValue();


        // auto-boxing and auto-casting cannot be done together
        int x = 10;
        long y = x;
        // Long yY = x;
        // explicit boxing, with auto-casting
        Long yY = Long.valueOf(x);
        // explicit casting, auto-boxing
        Long yY1 = (long) x;

        // Long z = 10; // this needs both auto-casting and auto-boxing because long with L is int;
    }
}
