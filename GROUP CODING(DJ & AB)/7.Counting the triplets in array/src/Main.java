// Note: triplet == three for loop
import java.util.Scanner;
/*
Concept: For ith,jth and kth  the three elements,then
triplet must satisfied: i+j = k array values.

Input : A[] = { 1, 2, 3, 4, 5 }
Output : 4
The valid triplets are:
(1, 2, 3), (1, 3, 4), (1, 4, 5), (2, 3, 5)

Input : A[] = {1, 1, 1, 2, 2}
Output : 6
(1,1,2), (1,1,2), (1,1,2), (1,1,2), (1,1,2), (1,1,2)
 */
public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		int n,i,j,k,temp,count=0;
		int arr[] = new int[50];

		System.out.println("Enter the no. of elements:");
		n = in.nextInt();
		for(i=0;i<n;i++)
	    	arr[i] = in.nextInt();

		for(j=0; j<n; j++) {
			for (i = j + 1; i < n; i++) {
				for(k=i+1;k<n;k++) {
					if (arr[i] + arr[j] == arr[k]) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
						count++;
					}
				}
			}
		}
		if(count==0)
			System.out.println("Triplet not found");
		else
	    	System.out.println("Total Triplets:  " +count);

    }
}
