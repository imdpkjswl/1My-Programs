// Prerequisite: Array must be sorted.
public class Main {

    static int binary(int[] arr, int low, int high, int x) {

        if(high < low)
            return -1;

        int mid = (low+high) / 2;

        if (arr[mid] == x)
            return mid;

        if (x < arr[mid])
            return binary(arr, low, mid-1, x);
        else
            return binary(arr, mid + 1, high, x);

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 14, 17, 23, 26, 32, 45, 51};
        int n = arr.length;
        int x = 45;

        int result = binary(arr, 0, n-1, x);
        if(result != -1)
            System.out.println("Key found at "+result);
        else
            System.out.println("Key not found");

    }
}
