package beyondclasses;

enum CompassComplex {
    NORTH("UP"),
    SOUTH("DOWN"),
    EAST("RIGHT"),
    WEST("LEFT");

    private final String instruction;
    private CompassComplex(String instruction) {
        System.out.println("Constructor called: " + instruction);
        this.instruction = instruction;
    }
    public String getInstruction() {
        return this.instruction;
    }
}

public class ComplexEnums {
    public static void main(String[] args) {
        String instruction = CompassComplex.NORTH.getInstruction();
        System.out.println(instruction);
    }
}
