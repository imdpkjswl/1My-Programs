public class Main {

    static int binary(int[] arr, int low, int high, int x) {

        if(high >= low) {
            int mid = low + (high-low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] >= x)
                return binary(arr, low, mid-1, x);

            return binary(arr, mid + 1, high, x);
        }
        else
            return -1;

    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 3, -4, 7, 3, 2, 12, 5, 1};
        int n = arr.length;
        int x = 5;

        int result = binary(arr, 0, n-1, x);
        if(result != -1)
            System.out.println("Key found");
        else
            System.out.println("Key not found");

    }
}
