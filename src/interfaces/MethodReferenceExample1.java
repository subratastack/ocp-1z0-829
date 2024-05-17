package interfaces;

@FunctionalInterface
interface Animal {
    public void speak(String s);
}

public class MethodReferenceExample1 {

    public static void shout(String s, Animal a) {
        a.speak(s);
    }

    public static void main(String[] args) {
        shout("Hello", a -> System.out.println(a));
    }
}
