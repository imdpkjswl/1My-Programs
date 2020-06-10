import java.util.Scanner;

public class Nqueen {

    static boolean place(int[] x, int k) {

        for (int i = 1; i <= k - 1; i++) {
            if (x[i] == x[k] || Math.abs(i - k) == Math.abs(x[i] - x[k]))
                return false;
        }
        return true;
    }

    static void nqueens(int n){
        int []x = new int[50];
        int count =0;
        int k = 1;

        x[k] = 0;

        while(k!=0)
        {
            x[k] += 1;

            while((x[k] <= n) && (!place(x,k)))
            {
                x[k] += 1;
            }
            if(x[k] <= n){
                if(k == n){
                    count++;
                    System.out.print("Solution "+count+" is\n");
                    print_solution(n,x);
                }
                else
                {
                    k++;
                    x[k] = 0;
                }
            }
            else
            {
                k--;
            }
        }
    }

    static void print_solution(int n, int[] x){
        char [][] c = new char[50][50];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                c[i][j] = 'X';
            }
        }

        for(int i=1;i<=n;i++){
            c[i][x[i]] = 'Q';
        }

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of queens:");
        n = in.nextInt();

        long start = System.currentTimeMillis();
        nqueens(n);
        long end = System.currentTimeMillis();

        System.out.println("Time taken to process in milliseconds:    "+(end-start));
    }
}
