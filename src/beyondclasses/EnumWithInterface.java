package beyondclasses;

interface Planet {
    public String getPlanet();
}

enum CompassInterface implements Planet {
    NORTH {
        @Override
        public String getPlanet() {
            return "Mercury";
        }
    },
    SOUTH {
        @Override
        public String getPlanet() {
            return "Venus";
        }
    },
    EAST, WEST;

    @Override
    public String getPlanet() {
        return "Earth";
    }
}

public class EnumWithInterface {
    public static void main(String[] args) {
        System.out.println(CompassInterface.NORTH.getPlanet());
        System.out.println(CompassInterface.EAST.getPlanet());
    }
}
