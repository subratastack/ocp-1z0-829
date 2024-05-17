package interfaces;

@FunctionalInterface
interface Checker {
    public boolean check(String s);
}

@FunctionalInterface
interface Checker2 {
    public boolean check();
}

public class MethodReferenceExample3 {
    public static void main(String[] args) {

        Checker ch = String::isBlank;
        System.out.println(ch.check("abd"));;

        String s = "hello";
        Checker2 ch1 = s::isEmpty;
        System.out.println(ch1.check());;
    }
}
