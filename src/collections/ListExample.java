package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();

        myList1.add("A");
        myList1.add("B");
        myList1.add("C");

        System.out.println("myList1: " + myList1);

        List<String> myList2 = new ArrayList<>(myList1);

        myList2.set(2, "D");

        System.out.println("myList2: " + myList2);
        System.out.println("myList1: " + myList1);
    }
}
