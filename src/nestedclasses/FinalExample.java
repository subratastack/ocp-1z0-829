package nestedclasses;

class Cat {
    public int age = 5;
    public static boolean isWild() { return false; }
}

class Tiger extends Cat {

    protected int age = 7;
    public static boolean isWild() { return true; }

    public static void main(String[] args) {
        Tiger dave = new Tiger();
        Cat rave = dave;

        System.out.println(dave.age);
        System.out.println(rave.age);
        System.out.println(dave.isWild());
        System.out.println(rave.isWild());
    }
}

public class FinalExample {
}
