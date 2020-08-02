import java.util.Arrays;
import java.util.Scanner;


class Main {

    // Swap element of ith and jth index.
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //selects last element as pivot, pi using which array is partitioned.
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Here we have selected the last element as pivot.
        int i = (low-1); // smaller element index

        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot index)
        swap(arr, i+1, high);

        return (i+1);
    }



    //routine to sort the array partitions recursively
    private static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(arr, low, high);

            // sort each partition recursively
            quick_sort(arr, low, pi-1);
            quick_sort(arr, pi+1, high);
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        //initialize a numeric array, intArray
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        //call quick_sort routine
        quick_sort(arr, 0, n-1);

        //print the sorted array
        System.out.println("\nSorted Array:   " + Arrays.toString(arr));


    }
}






// Iterative approach:
/*
class Main {

    //partitions the array around pivot=> last element
    static int partition(int[] numArray, int low, int high)   {
        int pivot = numArray[high];
        // smaller element index
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            // check if current element is less than or equal to pivot
            if (numArray[j] <= pivot) {
                i++;
                // swap the elements
                int temp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = temp;
            }
        }
        // swap numArray[i+1] and numArray[high] (or pivot)
        int temp = numArray[i + 1];
        numArray[i + 1] = numArray[high];
        numArray[high] = temp;
        return i + 1;
    }



    //sort the array using quickSort
    static void quickSort(int numArray[], int low, int high) {
        //auxiliary stack
        int[] intStack = new int[high - low + 1];

        // top of stack initialized to -1
        int top = -1;

        // push initial values of low and high to stack
        intStack[++top] = low;
        intStack[++top] = high;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            high = intStack[top--];
            low = intStack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int pivot = partition(numArray, low, high);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (pivot - 1 > low) {
                intStack[++top] = low;
                intStack[++top] = pivot - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (pivot + 1 < high) {
                intStack[++top] = pivot + 1;
                intStack[++top] = high;
            }
        }
    }

    public static void main(String[] args) {
        //define array to be sorted
        int[] numArray = { 3, 2, 6, -1, 9, 1, -6, 10, 5 };
        int n = numArray.length;
        System.out.println("Original Array:" + Arrays.toString(numArray));
        // call quickSort routine to sort the array
        quickSort(numArray, 0, n - 1);
        //print the sorted array
        System.out.println("\nSorted Array:" + Arrays.toString(numArray));
    }
}

*/