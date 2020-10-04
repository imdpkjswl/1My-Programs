import java.util.*;
import java.lang.*;


public class Main {

    private static String CovidRun(int N, int K, int X, int Y){
        int temp =0;
        for(int i=0;i<N;i++){
            temp = (X+K)%N;
            if(temp == Y)
                return "YES";
            X = temp;
        }

        return "NO";
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int t=0;
        if(in.hasNextInt()) {
            t = in.nextInt();  // Use when Runtime Error occurred.
        }

        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            String result = CovidRun(n, k, x, y);
            System.out.println(result);
        }
    }
}
