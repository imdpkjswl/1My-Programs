import java.util.Arrays;

public class Jagged {

    public static void main(String[] args) {

        // Definition: Jagged array is array of arrays such that member arrays can be of different sizes,
        // i.e., we can create a 2-D arrays but with variable number of columns in each row. These type of
        // arrays are also known as Jagged arrays.

        int[][] num = new int[3][]; // 3 indicates number of rows in array.

        num[0] = new int[5]; // first row contain 5 elements.
        num[1] = new int[6]; // second row contain 6 elements.
        num[2] = new int[7]; // third row contain 7 elements.

        System.out.println(Arrays.deepToString(num)); // This show elements present in a 3 rows.

        System.out.println("Size[number of rows] of array is :  " + num.length);
        System.out.println("Size of 1st row of array is :  " + num[0].length);
        System.out.println("Size of 2nd row of array is :  " + num[1].length);
        System.out.println("Size of 2rd row of array is :  " + num[2].length);


    }

}
