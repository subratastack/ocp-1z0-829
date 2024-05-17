package collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Object[] objArr = list.toArray();

        Integer[] intArr = list.toArray(new Integer[0]);
    }
}
