package exp;

import java.util.ArrayList;
import java.util.List;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}

public class Test1 {
    public static void main(String[] args) {
        /*Object [] arr = new Object[4];
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1:
                    arr[i] = new String("Java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(obj);
        }
*/



        // System.out.println("Output is: " + 10 != 5);





        /*String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));*/



        /*String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");*/

        System.out.println(100);
        /*Double [] arr = new Double[2];
        System.out.println(arr[0] + arr[1]);*/

        /*List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }*/

        System.out.println(0 % 2);

        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
        int i = '5';
        System.out.println(i);



        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);


    }
}