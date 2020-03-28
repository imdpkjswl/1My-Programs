// FIRST SELECT ONE ITEM FROM ARRAY AND COMPARE IT WITH REST ALL ELEMENTS OF ARRAY, IF ANY MATCHED,THEN ASSIGN ANY WEIRED VALUE ON
// THAT INDEX.AT LAST TRAVERSE THE ARRAY BUT PUT ONE CONDITION i.e.WEIRED VALUE NOT EQUALS TO ARRAY INDEX VALUES.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in  = new Scanner(System.in);

	int n,i,j;
	int arr[] = new int[100];

	System.out.println("Enter no. of elements:");
	n = in.nextInt();

	System.out.println("Enter "+n+" elements:");

	for(i=0;i<n;i++)
	    arr[i] = in.nextInt();

	int key;

	for(i=0;i<n;i++){
		key = arr[i];
		for(j=i+1;j<n;j++){
			if(key == arr[j])
				arr[j] = -9999;
		}
	}

	for(i=0;i<n;i++) {
	    if(arr[i] != -9999) {
	        System.out.print(arr[i]+"  ");
        }
    }

    }
}
