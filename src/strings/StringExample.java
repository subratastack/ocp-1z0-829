package strings;

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
    }
}
