import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fair_Elections{

    private static int solution(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        int ans=0;
        int sum1=0, sum2=0;
        for (int i:arr1){ sum1 += i; }
        for (int i:arr2){ sum2 += i; }
        if(sum1 > sum2){
            return 0; // win at zero swap
        }

        Collections.sort(arr1);  // sort in ascending order
        Collections.sort(arr2,Collections.reverseOrder()); // sort in descending order
        int min = Math.min(n,m); // get the minimum size of array

        for(int i=0;i<min;i++){
            if(arr1.get(i) < arr2.get(i)){
                //System.out.println(arr1.get(i) +"  "+ arr2.get(i));
                ans++;
                sum1 = sum1 - arr1.get(i) + arr2.get(i);
                sum2 = sum2 - arr2.get(i) + arr1.get(i);
                //System.out.println(sum1+" > "+sum2);
                if(sum1 > sum2){
                    return ans;
                }
            }else{
                return -1;
            }
        }
        return -1;
    }

    public static void main (String[] args) throws Exception {
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
            int M = 0;
            if (in.hasNextInt()) {
                M = in.nextInt();
            }

            ArrayList<Integer> arr1 = new ArrayList<>(N);
            ArrayList<Integer> arr2 = new ArrayList<>(M);
            //arr1.add(1);arr1.add(3);arr1.add(2);arr1.add(4);
            //arr2.add(7);arr2.add(8);arr2.add(6);
            for (int i = 0; i < N; i++) {
                arr1.add(in.nextInt());
            }
            for (int i = 0; i < M; i++) {
                arr2.add(in.nextInt());
            }

            int result = solution(arr1, N, arr2, M);
            System.out.println(result);
        }
    }

}
