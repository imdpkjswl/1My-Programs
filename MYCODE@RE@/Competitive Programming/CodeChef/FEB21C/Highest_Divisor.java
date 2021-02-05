import java.math.*;
import java.util.*;
import java.lang.*;
//Highest Divisor

class Highest_Divisor{  //Codechef{
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        int T = 0;if (in.hasNextInt()) { T = in.nextInt(); }
//        for (int t = 1; t <= T; t++) {
//            int N = 0;if (in.hasNextInt()) { N = in.nextInt();
//        }

        int num = 0;if (in.hasNextInt()) { num = in.nextInt();}
        int max;
        for(max=10; max>=1; max--) {
            if(num % max == 0){
                break;
            }
        }

        System.out.println(max);

    }
}
