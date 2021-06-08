import java.util.*;
import java.lang.*;

class SummerHeat {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) { T = in.nextInt(); }

        while(T-->0){
            int xa, xb;
            int ya, yb;
            xa = in.nextInt();
            xb = in.nextInt();
            ya = in.nextInt();
            yb = in.nextInt();

            int res = (ya/xa) + (yb/xb);
            System.out.println(res);
        }
       
    }
}
