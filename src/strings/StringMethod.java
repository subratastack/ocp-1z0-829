package strings;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        int[] arr = new int[]{65, 66, 67, 68, 69, 70};
        System.out.println(String.valueOf(65));

        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(45);
        stringBuffer.append(48);
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());

        char[] dest = new char[4];
        stringBuffer.getChars(1, 5, dest, 0);
        System.out.println(Arrays.toString(dest));
    }
}
