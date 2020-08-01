public class Main {
    static int max = Integer.MIN_VALUE;
    static void findMax(int[] arr, int low, int high) {
        // Base case, when array have only one element after divide it.
        if(low == high) {
            if (arr[high] > max)  // arr[low] > max
                max = arr[high];
            return;
        }

        int mid = (low + high) / 2;
        findMax(arr, low, mid );
        findMax(arr, mid+1, high);

    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 3, -4, 7, 3, 2, 12, 5, 1};
        int n = arr.length;

        findMax(arr, 0, n-1);
        System.out.println("Max value in array:  "+max);

    }
}
