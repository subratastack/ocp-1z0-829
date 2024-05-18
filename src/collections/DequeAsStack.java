package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {

    public static void main(String[] args) {

        Deque<String> colors = new ArrayDeque<>();
        colors.push("red");
        colors.push("blue");
        colors.push("green");
        colors.push("yellow");
        System.out.println(colors);

        System.out.println(colors.peek());
        colors.poll();
        System.out.println(colors);
        colors.poll();
        System.out.println(colors);
        colors.push("violet");
        System.out.println(colors);
        colors.add("purple");
        System.out.println(colors);
        colors.remove();
        System.out.println(colors);
    }
}
