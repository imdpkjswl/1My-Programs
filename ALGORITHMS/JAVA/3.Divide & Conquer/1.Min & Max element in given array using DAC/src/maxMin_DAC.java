// Code to demonstrate Divide and Conquer Algorithm

// function to find the maximum no. in a given array.

public class maxMin_DAC {

    static int DAC_Max(int[] a, int index, int l) {
        int max;
        if (index >= l - 2) { // second last index
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }
        // logic to find the Maximum element in the given array.
        max = DAC_Max(a, index + 1, l);

        if (a[index] > max)
            return a[index];
        else
            return max;
    }

    // Function to find the minimum no. in a given array.
    static int DAC_Min(int[] a, int index, int l) {
        int min;
        if (index >= l - 2) { // second last index
            if (a[index] < a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Minimum element in the given array.
        min = DAC_Min(a, index + 1, l);

        if (a[index] < min)
            return a[index];
        else
            return min;
    }

    // Driver Code
    public static void main(String... args) {
        // Defining the variables
        int min, max, N;

        // Initializing the array
        int[] arr = {70, 250, 50, 80, 140, 12, 14, 34, 8};

        // recursion - DAC_Max function called
        max = DAC_Max(arr, 0, 9);

        // recursion - DAC_Max function called
        min = DAC_Min(arr, 0, 9);
        System.out.printf("The minimum number in a given array is : %d\n", min);
        System.out.printf("The maximum number in a given array is : %d", max);

    }

}