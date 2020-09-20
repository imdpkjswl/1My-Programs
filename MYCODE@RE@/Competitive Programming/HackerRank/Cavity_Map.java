//Cavity Map - n x n matrix
// Cavity = L, R, T, B  < Cavity.value  && not on border
// Mark all cavitys with X


//iterate through inner matrix
//Check L, R, T, B  != X &&  < current value
//Add to a list




import java.io.*;
import java.util.*;

public class Cavity_Map {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] map = new int[n * n];

        int index = 0;
        //Initialize our n*n matrix
        for (int i = 0; i < n; i++) {
            String row = in.nextLine();

            for (int j = 0; j < n; j++) {

                map[index++] = Character.getNumericValue(row.charAt(j));;
            }
        }



        for (int i = 0; i < n * n; i++) {
            //If it is not on the border
            if (i % n != 0 && (i - (n - 1)) % n != 0 && i > n - 1 && i < (n * n) - n) {
                //Left
                int L = map[i - 1];

                //Right
                int R = map[i + 1];

                //Top
                int T = map[i - n];

                //Bottom
                int B = map[i + n];

                //if they are all < this is cavity print x
                if (L < map[i]  && R < map[i] && T < map[i] && B < map[i]) {
                    System.out.print("X");
                    continue;
                }
            }

            System.out.print(map[i]);

            //If this is the right edge start a new line
            if ((i - (n - 1)) % n == 0) {
                System.out.println("");
            }
        }
    }
}