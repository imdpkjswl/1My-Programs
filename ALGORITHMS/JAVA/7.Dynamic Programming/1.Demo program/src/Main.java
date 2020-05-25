// Program that illustrate the time complexity with dynamic programming and without dynamic programming

public class Main {
    /** Time complexity: Exponential
    public static int fib(int n){
        if(n <= 1)
            return n;
        return fib(n-1)+fib(n-2);
    }
     */

    // Time complexity: Linear
    public static int fib(int n)
    {
        int []f = new int[50];
        f[0] = 0;
        f[1] = 1;

        for(int i=2;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {

        int n =5;
        int result = fib(n);
        System.out.println(result);

    }
}
