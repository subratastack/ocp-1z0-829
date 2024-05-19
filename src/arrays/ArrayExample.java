package arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int a [][] = {{1, 2 ,3 }, {4, 5}, {6, 7}, {8}, {9, 10, 11}};

        for (int row []: a) {
            for (int elem: row) {
                System.out.println("Element: " + elem);
            }
        }
    }
}
