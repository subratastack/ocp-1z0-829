package classdesign;

class Mammal11 {
    public String name = "Hello";

    public void speak() {
        System.out.println("Mammal speak");
    }
}

public class Dog11 extends Mammal11 {
    public String name = "World";

    private static String justStatic = "just";

    public void justMethod() {
        System.out.println(justStatic);
    }

    public static void justMethodStatic() {
        // System.out.println(this.name);
        System.out.println(new Dog11().name);
    }

    @Override
    public void speak() {
        System.out.println("Dog speak");
    }

    public static void main(String[] args) {

        Mammal11 m = new Mammal11();
        Dog11 d = new Dog11();
        Mammal11 d1 = new Dog11();
        Mammal11 d2 = d;

        m.speak();
        d.speak();
        d1.speak();
        System.out.println("d.name: " + d.name);
        d2.speak();
        System.out.println("d2.name: " + d2.name);
        d.justMethod();
        justMethodStatic();
    }
}
