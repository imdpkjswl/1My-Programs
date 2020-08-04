class Main {

    // Returns value of Binomial Coefficient C(n, k)
    static int binomialCoefficient(int n, int r) {

        int res = 1;

        // Since C(n, k) = C(n, n-k) 
        if (r > n - r)
            r = n - r;


        // [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1] 
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }


    public static void main(String[] args) {

        int n = 5;
        int r = 2;
        System.out.println("Value of C(" + n + ", " + r + ") " + "is" + " " + binomialCoefficient(n, r));

    }
} 