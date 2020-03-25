import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i,j,n;
        int []arr = new int[50];
        int []sarr = new int[50];
        System.out.println("Enter the size of an array");
        n = in.nextInt();

        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        // Without using any sorting algorithm
        j=0;
        for(i=0;i<n;i++)
            if(arr[i] == 0 )
                sarr[j++] = arr[i];

        for(i=0;i<n;i++)
            if(arr[i] == 1 )
                sarr[j++] = arr[i];

        for(i=0;i<n;i++)
            if(arr[i] == 2 )
                sarr[j++] = arr[i];

            for(i=0;i<n;i++){
                System.out.print(sarr[i]+"  ");
            }
    }
}
