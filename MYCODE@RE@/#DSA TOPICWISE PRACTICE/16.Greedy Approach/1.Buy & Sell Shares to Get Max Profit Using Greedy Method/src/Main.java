public class Main {


    private static int getMax(int[] arr){

        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){  // sell at peek and buy at bottom.
                profit += arr[i] - arr[i-1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] arr = {1, 8, 7, 3, 5, 2};

        System.out.println("Max Profit:  "+getMax(arr));

    }
}
