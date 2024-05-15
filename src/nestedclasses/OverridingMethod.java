package nestedclasses;

class Dog {
    public int getSpeed() { return 20; }
    public final int getSpeedFinal() { return 30; }
    public static int getSpeedStatic() { return 40; }
    public void printSpeed() {
        System.out.println(getSpeedStatic());
    }
}

public class OverridingMethod extends Dog {

    @Override
    public int getSpeed() { return 25; }

    public static int getSpeedStatic() {
        return 55;
    }

    public static void main(String[] args) {
        OverridingMethod overridingMethod = new OverridingMethod();
        System.out.println(overridingMethod.getSpeed());
        System.out.println(overridingMethod.getSpeedFinal());
        overridingMethod.printSpeed();
    }
}
