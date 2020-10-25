import java.util.*;

/*
Given:
	a1, a2, ..., an = Arrays value given.

	Find the values of b1, b2, ..., bn, which satisfying the below condition: 
	a1*b1 + a2*b2 + ... +an*bn = 0

ANSWER:
The following is always a valid answer: −a2, a1, −a4, a3, ..., −an, an−1.	
	
*/

class A_Finding_Sasuke{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int testcases = in.nextInt();
		

	while(testcases-- >0){
		int n = in.nextInt(); // must be even as mentioned.

		int[] a = new int[n];
		int[] ans = new int[n];

		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}	

		for(int i=1;i<n;i+=2){
			int a2 = -a[i];
			int a1 = a[i-1];
			a[i-1] = a2;
			a[i] = a1;
		}

		for(int i: a)
			System.out.print(i+" ");
		System.out.println();
	}
	}
}