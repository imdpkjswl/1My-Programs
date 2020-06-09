import java.util.*;


public class TwoPointAlgo {

    public static boolean findTripets(int[] arr, int n){

        Arrays.sort(arr);
        for(int i=0;i<n-2;i++) {
                if(findTwoSum(arr, -arr[i], i+1))
                    return true;
        }

        return false;
    }

    private static boolean findTwoSum(int[] arr, int x, int i) {
        int j = arr.length-1;
        while(i<j) {
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
        int[] arr = new int[20];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        System.out.println(findTripets(arr,n));
    }

}
