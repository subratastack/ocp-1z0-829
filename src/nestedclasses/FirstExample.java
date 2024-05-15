package nestedclasses;

public class FirstExample {

    private final String outerVar = "hello";

    protected class InnerClass {

        static void innerMethodOfInnerClass() {
            System.out.println("Inside inner method of inner class");
        }
    }

    public static void main(String[] args) {

        // InnerClass.innerMethodOfInnerClass();
    }
}

class AnotherClass {

    public static void main(String[] args) {
        FirstExample.InnerClass.innerMethodOfInnerClass();
    }
}