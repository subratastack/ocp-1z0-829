package beyondclasses;

enum Compass {
    NORTH, SOUTH, EAST, WEST;
}

public class SimpleEnums {

    public static void main(String[] args) {
        for (var direction: Compass.values()) {
            System.out.println(direction.ordinal() + "--" + direction.name());
        }

        Compass N = Compass.NORTH;

        switch (N) {
            case EAST -> System.out.println("EAST");
            case NORTH -> System.out.println("NORTH");
            case WEST -> System.out.println("WEST");
            case SOUTH -> System.out.println("SOUTH");
            default -> System.out.println("No compass");
        }
    }
}
