import java.util.*;
import java.lang.*;

class ValidPair {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        int a=0,b=0,c=0;
        if (in.hasNextInt()) {a = in.nextInt();}
        if (in.hasNextInt()) {b = in.nextInt();}
        if (in.hasNextInt()) {c = in.nextInt();}

        if(a == b || b == c || c == a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}