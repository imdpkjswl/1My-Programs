import java.util.Arrays;
import java.util.Scanner;

public class A_Reorder {

    private static String mySolution(int[] a,int n, int m){
        int Nr=0;
        int Dr=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                Nr = (Nr*j) + (a[j]*Dr);
                Dr = Dr*j;
            }
        }

        // Checking for fraction
        int t1 = Nr/Dr;
        int t2 = t1*Dr;
        if(t2 != Nr)
            return "NO";

        if(Nr/Dr ==m)
            return "YES";
        else
            return "NO";
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t-- > 0) {
            int n, m;
            n = in.nextInt();
            m = in.nextInt();

            int[] a = new int[n + 1];

            a[0] = 0; // ignore
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a); // need this in mySolution
            String result = mySolution(a, n, m);
            System.out.println(result);
        }
    }
}
