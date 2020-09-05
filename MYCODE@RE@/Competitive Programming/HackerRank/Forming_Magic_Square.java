/*
Initial Thoughts:
There are a limited number of ways a magic
square can be formed, so we can use brute-force
check those solutions and choose the one of that
it would take the smallest sum to obtain.
Time Complexity: O(1) //There are only 9 combos to check, no matter the arrangement
Space Complexity: O(1) //No dynamically allocated space
*/
import java.io.*;
import java.util.*;

public class Forming_Magic_Square {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][][] possiblePermutations = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, // 1
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}}, // 2
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, // 3
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, // 4
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, // 5
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, // 6
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, // 7
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}, // 8
        };

        // Take inputs
        int[][] given = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                given[i][j] = in.nextInt();
        }

        // Now, perform mapping on given matrix with all possible permutation of magic sqaure(3X3)
        int minCost = Integer.MAX_VALUE;  // use to find min cost among all mapping to be performed.
        for (int i = 0; i < 8; i++) {
            int permutationCost = 0; // use to count permutation cost for each mapping.
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    permutationCost += Math.abs(given[j][k] - possiblePermutations[i][j][k]);
                }
            }
            minCost = Math.min(minCost, permutationCost);
        }
        System.out.println(minCost);
    }

}