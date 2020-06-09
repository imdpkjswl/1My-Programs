import java.util.*;

/**
 * Note: Two pointer Algorithm work only on sorted array like binary search.
 * Time complexity : O(n^2)
 *
 * The Naive Approach O(n^3):

                                                                     Function() {
                                                                         for(int i=0;i<arr.length;i++){
                                                                                for(int j=i+1;j<arr.length;j++){
                                                                                    for(int k=j+1;k<arr.length;k++){
                                                                                        if(arr[i] + arr[j] + arr[k] == 0){
                                                                                            return true;
                                                                                        }
                                                                                   }
                                                                                }
                                                                         }
                                                                         return false;
                                                                     }

        ## Another Naive Approach O(n^3):

         Function() {
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                        if(-arr[i] == arr[j] + arr[k]){
                            return true;
                        }
                    }
                }
            }
         return false;
         }
 */


public class TwoPointAlgo {

    public static boolean findTripets(int[] arr, int n){

        Arrays.sort(arr);
        System.out.println("Sorted array is:  "+Arrays.toString(arr));
        for(int i=0;i<n-2;i++) {
                if(findTwoSum(arr, -arr[i], i+1))
                    return true;
        }

        return false;
    }

    private static boolean findTwoSum(int[] arr, int x, int i) {
        int j = arr.length-1;

        while(i<=j) {
            if(arr[i] + arr[j] > x)
                j--;
            else if(arr[i] + arr[j] < x)
                i++;
            else
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        System.out.println("Triplet found status:  "+findTripets(arr,n));

    }

}
