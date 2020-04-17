/*
Examples:

		Input:
		arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
		k = 3
		Output:
		[3, 2, 1, 6, 5, 4, 9, 8, 7]



		Input:
		arr = [1, 2, 3, 4, 5, 6, 7, 8]
		k = 12
		Output:
		Item not found

		Input:
		arr = [1, 2, 3, 4, 5, 6]
		k = 6
		Output:
		[6, 5, 4, 3, 2, 1]

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int n, k, index,i;
	int []arr = new int[50];
	int []res = new int[50];

	System.out.println("Enter the size of array");
	n = in.nextInt();
	for(i=0;i<n;i++)
	    arr[i] = in.nextInt();

	System.out.println("Enter the item ");
	k = in.nextInt();

	boolean flag = false;
	// Finding index of kth value position.
	index = 0;
	for(i=0;i<n;i++){
	    index++;
	    if(arr[i] == k){
	    	flag = true;
	        break;
        }
    }

	if(flag == false){
		System.out.println("Entered item not found");
		return;
	}

	// Reversing only index'th index and storing into res[]
	int j = 0;
	for(i=0;i<index;i++){
	    res[j++] = arr[index - i-1];
    }

	// Copying elements after index'th index into res[]
	for(i=k;i<n;i++){
	    res[j++] = arr[i];
    }

	System.out.println("Reverse an array in groups :");
	for(i=0;i<n;i++){
	    System.out.print(res[i]+"  ");
    }


    }
}
