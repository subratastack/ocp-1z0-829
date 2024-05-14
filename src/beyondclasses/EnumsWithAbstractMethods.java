package beyondclasses;
enum CompassAbstract {
    NORTH {
        public String getDirection() {
            return "UP";
        }
    },
    SOUTH {
        public String getDirection() {
            return "DOWN";
        }
    },
    EAST {
        public String getDirection() {
            return "LEFT";
        }
    },
    WEST {
        public String getDirection() {
            return "RIGHT";
        }
    };
    public abstract String getDirection();
}

public class EnumsWithAbstractMethods {

    public static void main(String[] args) {
        System.out.println(CompassAbstract.SOUTH.getDirection());
    }
}
