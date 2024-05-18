package classdesign;

class Mammal {

    public Mammal() {
        System.out.println("Parent constructor called");
    }
    static {
        System.out.println("Parent static initializer");
    }

    {
        System.out.println("Parent instance initializer");
    }
}

public class Dog extends Mammal {

    private final String val1;
    private final String val2;
    private int counter = 0;

    public Dog() {
        System.out.println("Child constructor called - " + this.counter);
        this.val1 = "Val1";
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Child main() method");

        new Dog();
        System.out.println("-".repeat(30));
        new Dog();
        System.out.println("-".repeat(30));
        new Dog();
        System.out.println("-".repeat(30));
    }

    static {
        System.out.println("Child static initializer");
    }

    {
        System.out.println("Child instance initializer - " + this.counter);
        this.val2 = "Val2";
    }
}
