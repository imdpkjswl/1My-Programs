import java.util.*;

public class TSPBruteForceTechnique {
    static Scanner in = new Scanner(System.in);
    static int src;
    static int optimum=999;
    static int[][] c = new int[50][50];

    // function to swap array elements
    static void swap(int[] v, int i, int j) {
            int temp;
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
    }

    // recursive function to generate permutations
    static void brute_force(int[] v, int n, int i) {
        // this function generates the permutations of the array from element i to element n-1
        int j, sum, k;
        //if we are at the end of the array, we have one permutation
        if (i == n) {
            if(v[0]==src) {
                for (j=0; j<n; j++)
                    System.out.print (v[j]+" ");
                sum=0;

                for( k=0;k<n-1;k++) {
                    sum = sum+c[v[k]][v[k+1]];
                }
                sum = sum + c[v[n-1]][src];

                System.out.println("sum =  "+sum);
                if (sum < optimum)
                    optimum = sum ;
            }
        }
        else
            // recursively explore the permutations starting at index i going through index n-1
            for (j=i; j<n; j++) { // try the array with i and j switched
                swap (v, i, j);
                brute_force (v, n, i+1);
                // swap them back the way they were
                swap (v, i, j);
            }
    }

    public static void main (String[] args) {
        int n;
        int[] v = new int[50];  // used for permutations
        System.out.print("Enter the no. of vertices: ");
        n = in.nextInt();
        for (int i=0; i<n; i++)
            v[i] = i+1;  // contain vertices sequences
        System.out.print("Enter cost matrix\n");
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                c[i][j] = in.nextInt();
        System.out.println("Enter source: ");
        src = in.nextInt();
        brute_force (v, n, 0);

        System.out.println("Optimum solution with brute force technique is:  "+optimum);

    }
}
