import java.math.*;
import java.util.*;
import java.lang.*;
//Maximise Function
/* MY APPROACH GOT WRONG HERE:
class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;
        if (in.hasNextInt()) {
            T = in.nextInt();
        }
        for (int t = 1; t <= T; t++) {
            int N = 0;
            if (in.hasNextInt()) {
                N = in.nextInt();
            }
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            //for(int a : arr)
                //System.out.print(a+"  ");
            int x = arr[0]; // min
            int y = arr[1]; // second min
            int z = arr[N-1];  // max
            //System.out.println("\n"+x+"\n"+y+"\n"+z);

            int res = Math.abs(x - y) + Math.abs(y - z) + Math.abs(z - x);
            System.out.println(res);
        }
    }
}
*/



// ORIGINAL ANSWER:
class Maximise_Function {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long T = 0;
        if (in.hasNextLong()) {
            T = in.nextLong();
        }
        for (long t = 1; t <= T; t++) {
            int N = 0;
            if (in.hasNextLong()) {
                N = in.nextInt();
            }
            long[] arr = new long[N];
            long max = Integer.MIN_VALUE;
            long min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextLong();

                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }

            long diff = max-min;
            System.out.println(diff*2);
        }
    }
}

