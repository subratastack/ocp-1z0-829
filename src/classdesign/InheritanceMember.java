package classdesign;

class Mammal1 {
    public String name = "Hello";

    public void speak() {
        System.out.println("Mammal speak");
    }
}

class Dog1 extends Mammal1 {
    public String name = "World";

    @Override
    public void speak() {
        System.out.println("Dog speak");
    }
}

public class InheritanceMember {

    public static void main(String[] args) {

        Mammal1 m = new Mammal1();
        Dog1 d = new Dog1();
        Mammal1 d1 = new Dog1();
        Mammal1 d2 = d;

        m.speak();
        d.speak();
        d1.speak();
        System.out.println("d1.name: " + d1.name);
        d2.speak();
        System.out.println("d2.name: " + d2.name);
    }
}
