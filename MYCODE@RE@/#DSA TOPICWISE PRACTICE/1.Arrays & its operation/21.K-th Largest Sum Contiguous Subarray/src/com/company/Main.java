package com.company;

import java.util.*;


/** THIS PROGRAM TOOK ME 1.5 HOURS TO THINK ABOUT LOGIC IN LOCKDOWN:):)
 * Time Complexity: O(n^2) due to nested loop.
 * Auxiliary Space: O(k), where k is the size of dynamic temp array.
 */
public class Main {
    public static int largeSumContSubArray(int[] arr, int n, int k) {
        List<Integer> temp = new ArrayList<>();

        int large = 0;

        // placing individual element into temp array, it may be the large one.
        for(int i=0;i<n;i++)
            temp.add(arr[i]);


        // Placing the sum of all two contiguous element.
        for(int i=1;i<n;i++)
            temp.add(arr[i-1] + arr[i]);


        // Placing the right to left possible contiguous sub-array sums.EXCEPT the last element(Already included previously).
       for(int i=0;i<n-2;i++){ // why n-2: bcuz from 0 to n-1 will create sub-array that is already calculated.
            int sum =0;
           for(int j=i;j<n;j++){
               sum += arr[j];
           }
           temp.add(sum);
       }

        // Placing the left to right possible contiguous sub-array sums starting from second last to zero index.
       for(int i =0;i<n-3;i++) { // why n-3: bcuz 1 for last index and 2 for first two index element can generate same sub-array sums that already calculated.
           int sum=0;
           for(int j=n-2;j>=0;j--) {
               sum += arr[j];
           }
           temp.add(sum);
       }

       // Sorting the list.
        Collections.sort(temp, Collections.reverseOrder());

        System.out.println("The sorted array is for reference:");
        System.out.println(Arrays.toString(temp.toArray())+"\n");

        for(int i=0;i<k;i++) {
            large = temp.get(i);  // finding the Kth largest element in sorted sub-array sums.
        }
        return large;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int k,max;
        System.out.println("Enter the value of k:");
        k= sc.nextInt();

        max = largeSumContSubArray(arr, n, k);


        System.out.print(k+"th largest subarray is:  " +max);
    }
}
