package interfaces;

@FunctionalInterface
interface Calculator {
    public double path(double t);
}

class Gravity {
    public static double freeFall(double a) {
        final double g = 9.81;
        return 0.5 * g * a*a;
    }
}

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        Calculator cal = Gravity::freeFall;
        System.out.println(cal.path(10));;
    }
}
