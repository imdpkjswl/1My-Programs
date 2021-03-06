
import java.math.*;
import java.util.*;
import java.lang.*;

class No_Time_To_Wait {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = 0;if (in.hasNextInt()) { N = in.nextInt(); }
        int H = 0;if (in.hasNextInt()) { H = in.nextInt(); }
        int h = 0;if (in.hasNextInt()) { h = in.nextInt(); }

        int[] T = new int[N];
        for(int i=0;i<N;i++){
            T[i] = in.nextInt();
        }

        int timeRequired = H-h;

        boolean flag = false;
        for(int t: T){
            if(t >= timeRequired){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}

