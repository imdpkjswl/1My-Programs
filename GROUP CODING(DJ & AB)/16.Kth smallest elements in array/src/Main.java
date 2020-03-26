import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n,k,i,j,temp;
	Scanner in = new Scanner(System.in);
	int arr[]  = new int[50];

	System.out.println("Enter the size of array");
	n = in.nextInt();
	for(i=0;i<n;i++)
	    arr[i]=in.nextInt();

	for(j=1;j<n;j++){
	    for(i=0;i<n-j;i++){
	        if(arr[i] >= arr[i+1]){
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
            }
        }
    }

	System.out.println("Enter the Kth position:");
	k=in.nextInt();

	for(i=0;i<n;i++){
	    if(i == k-1){
	        break;
        }
    }

	System.out.println("The "+k+"th smallest element is :  "+arr[i]);
    }
}
