public class QuickSort_EASY {
    private static void QuickSortAlgo(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            QuickSortAlgo(arr, low, pi-1);
            QuickSortAlgo(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l-1;

        for(int j=l;j<r;j++){
            if(arr[j] < pivot){
                swap(arr, ++i, j);
            }
        }
        swap(arr, i+1, r);

        return (i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 7};
        QuickSortAlgo(arr, 0, arr.length-1);

        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
