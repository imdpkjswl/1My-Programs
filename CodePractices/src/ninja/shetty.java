package ninja;
import java.util.*;
/**
 * Input:
 * 4  // no. of rope
 * 20 // max jump at a time
 * 2 // slip each time
 * 20 20 16 18 // length of rope
 *
 * Output:
 * 4

 */
public class shetty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N rope
        int H = sc.nextInt(); // max jump
        int S = sc.nextInt(); // slip
        int[] a = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++){a[i]=sc.nextInt(); sum += a[i];}

        int start = 0, jumps = 0;
        while(true){
            start += H; // jump
            ++jumps;
            if(start >=sum){
                break;
            }
            start -= S;
        }

        System.out.println(jumps);
    }
}
