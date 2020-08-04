/*
class Main {

    // Returns value of Binomial Coefficient C(n, k)
    static int binCff(int n, int k) {

        // Base Cases 
        if (k == 0 || k == n)
            return 1;


        return binCff(n - 1, k - 1) + binCff(n - 1, k);
    }


    public static void main(String[] args) {

        int n = 5, k = 2;
        System.out.printf("Value of C(%d, %d) is %d ", n, k, binCff(n, k));

    }
}

*/



class Main {

    static int binCff(int n, int k) {
        int[] C = new int[k + 1];

        // nC0 is 1
        C[0] = 1;

        for (int i = 1; i <= n; i++)
        {
            // Compute next row of pascal triangle using the previous row
            for (int j = Math.min(i, k); j > 0; j--)
                C[j] = C[j] + C[j-1];
        }
        return C[k];
    }


    public static void main(String[] args) {

        int n = 5, k = 2;
        System.out.printf("Value of C(%d, %d) is %d ", n, k, binCff(n, k));

    }

}