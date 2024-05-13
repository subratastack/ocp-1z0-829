package console;

import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null) {
            String name = console.readLine("What is your name?");
            console.format("Hello, %s!%n", name);
            console.writer().println("-".repeat(30));
        } else {
            System.out.println("Console unavailable!!");
        }
    }
}
