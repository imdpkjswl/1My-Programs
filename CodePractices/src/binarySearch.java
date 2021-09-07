public class binarySearch {
    private static boolean binarySearch(int[] arr, int low, int high, int key){
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(arr[mid] == key)
                return true;
            if(arr[mid] < key)
                low = mid+1;
            else
                high = mid-1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 12, 23, 25, 34, 45, 52};
        int key = 23;

        boolean result = binarySearch(arr, 0, arr.length-1, key);
        System.out.println(result);
    }
}
