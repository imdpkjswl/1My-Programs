import java.util.*;

public class binarySearchRecursively {

    static Scanner in = new Scanner(System.in);
    static int []a = new int[100];
    static int n,temp,mid,low,high,key;
    static boolean result;

    // Taking array input
    static void acceptInput(int[] a){
        System.out.println("Enter "+n+" elements: ");

        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
    }

    //Displaying array elements
    static void displayInput(int []a){
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");

        System.out.println();
    }


    // Applying bubble sort
    static void sortInput(int []a){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } } }
    }

    // Searching key recursively
    static boolean binaryRecursive(int low, int high,int key){
        if(low == high){
            if(a[low] == a[high])
                return true;
            else
                return false;
        }else{

            mid = (low+high)/2;

            if(key == a[mid])
                return true;
            if(key > a[mid])
                return binaryRecursive(mid+1,high,key);
            else
                return binaryRecursive(low,mid-1,key);
        }
    }


    public static void main(String ...args){
        System.out.println("Enter the size of array: ");
        n=in.nextInt();
        low =0;
        high= n-1;

        acceptInput(a);
        displayInput(a);

        System.out.println("Enter key to be searched: ");
        key = in.nextInt();

        result = binaryRecursive(low,high,key);

        if(result)
            System.out.println(key+" is found.");
        else
            System.out.println(key+" is not found.");
    }
}
