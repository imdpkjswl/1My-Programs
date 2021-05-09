import java.util.*;
import java.lang.*;

class Solubility {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

       while(T-->0){
           int X = 0;if (in.hasNextInt()) {X = in.nextInt();}
           int A = 0;if (in.hasNextInt()) {A = in.nextInt();}
           int B = 0;if (in.hasNextInt()) {B = in.nextInt();}

           int ans = (A + (100-X)*B);
           ans *= 10;

           System.out.println(ans);
        }
    }

}




