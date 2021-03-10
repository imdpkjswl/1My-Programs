import java.util.*;
import java.lang.*;

class Space_Arrays {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        for(int t=1;t<=T;t++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr); 
//            for (int i : arr) {
//                System.out.print(i + "  ");
//            }

            boolean flag = false;
            for (int p = 1; p <= N; p++) {
                if (arr[p - 1] > p) {
                    System.out.println("Second");
                    //System.out.println(arr[k] +"  "+k);
                    flag = true;
                    break;
                }//end of if
            }// end of for

            int diffSUM = 0;
            if (!flag) {
                //System.out.println(flag);
                for (int k = 1; k <= N; k++) {
                    diffSUM += (k - arr[k - 1]);
                }// end of for

                if (diffSUM % 2 != 0) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                } // end of if
            } // end of if




        }// end of test case


    }

}


/**<<< LOGIC OF THIS PROBLEM >>>

* First sort the given array
* consider a permutation numbering(p) from 1 to N,
* and compare i.e. arr[p - 1] > p , if satisfied return second wins.
* if not, then iterate again and find sum of difference of (p-arr[p-1]).
* check for sum, if sum if odd the first wins otherwise second wins. 
*/


