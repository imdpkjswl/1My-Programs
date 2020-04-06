/*
    * Modified bubble sort is just an enhancement to the bubble sort algorithm.
    * It wont improve the algorithm worst case running time but on an average
    * case or for nearly sorted array it is a great improvement as it skips many passes.

* Modified bubble sort keeps count of the number of adjacent inversions in each pass and
* when there are no adjacent inversions the algorithm halts as the list will be sorted
* if there are no adjacent inversions.

* ALGORITHMS::::::::
void bubble(int a[], int n){
	for(int i=0; i<n; i++){
		int swaps=0;
		for(int j=0; j<n-i-1; j++){
			if(a[j]>a[j+1]){
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				swaps++; // we can also write swaps=1;
			}
		}
		if(swaps==0)
			break;
	}
}

 */



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,i,j,temp;
        int []a = new int[100];

        System.out.println("Enter number of elements");
        n=in.nextInt();

        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();


        int flag;
        for(j=1;j<n;j++)
        {
            flag =0;
            for(i=0;i<n-j;i++)
            {
                if(a[i]>a[i+1])
                {
                    flag=1;
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                }

            }
            System.out.println("Total pass :  "+j);
            if(flag==0)
                break;
        }



        System.out.println("The sorted array is :");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");

    }

}
