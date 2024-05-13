package serialization;

import java.io.*;

public class SerializationExample {

    public static void serialize(Object object, String filename) throws IOException {
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            out.writeObject(object);
        }
    }

    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            return in.readObject();
        }
    }

    public static void main(String[] args) {

        User user = new User("Subrata", "my password");

        try {
            serialize(user, "user.ser");
            User deserializedUser = (User) deserialize("user.ser");
            System.out.println(deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
