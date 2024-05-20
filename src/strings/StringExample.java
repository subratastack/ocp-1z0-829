package strings;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class StringExample {

    public static void main(String[] args) {

        String name1 = "John";
        String name2 = new String("John");
        String name3 = new String(new char[]{'J', 'o', 'h', 'n'});
        String name4 = String.valueOf(new StringBuffer("John"));
        String name5 = name1;
        String name6 = "John";

        System.out.println("name1 == name2 : " + (name1 == name2)); // checks for reference
        System.out.println("name1.equals(name2) : " + name1.equals(name2)); // checks the value
        System.out.println("name1 == name5 : " + (name1 == name5));

        System.out.println("-".repeat(10));

        System.out.println("name2 == name3 : " + (name2 == name3));
        System.out.println("name2.equals(name3) : " + (name2.equals(name3)));

        System.out.println("-".repeat(10));

        System.out.println("name1 == name4 : " + (name1 == name4));
        System.out.println("name1.equals(name4) : " + (name1.equals(name4)));

        System.out.println("-".repeat(10));

        System.out.println("name1 == name6 : " + (name1 == name6));
        System.out.println("name1.equals(name6) : " + (name1.equals(name6)));

        System.out.println("-".repeat(10));

        String s1 = "Paris";
        String s2 = "   Paris   ".trim();
        String s3 = "   Paris   ".trim().intern();
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));

        System.out.println("+=".repeat(20));

        final String fName = "James";
        String lName = "Gosling";
        String name11 = fName + lName;
        String name22 = fName + "Gosling";
        String name33 = "James" + "Gosling";
        String name44 = fName + "Gosling";
        System.out.println(name11 == name22);
        System.out.println(name22 == name33);;
        System.out.println(name33 == name44);

        boolean [] flag = new boolean[1];
        System.out.println(flag[0]);

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        list.removeIf(a -> a % 10 == 0);

        System.out.println(list);


        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);

        final int i1 = 1;
        final Integer i2 = 1;
        final String s11 = ":ONE";

        String str1 = i1 + s11;
        String str2 = i2 + s11;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(0, "BLUE");
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        System.out.println(trafficLight);

        Boolean[] arr = new Boolean[1];
        System.out.println(arr[0]);

        List<Integer> list222 = new ArrayList<>();
        list222.add(110);
        list222.add(new Integer(110));
        list222.add(110);

        System.out.println(list222);

    }
}
