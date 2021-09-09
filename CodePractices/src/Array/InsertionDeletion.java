package Array;

public class InsertionDeletion {
    private static int insertAtPos(int[] a, int n, int item, int pos) {
        if(pos>n || pos<0){
            return 0;
        }
        for(int i=n-1;i>=pos;i--){
            a[i+1] = a[i];
        }
        a[pos] = item;

        return (n+1);
    }

    private static int deleteAtPos(int[] a, int n, int pos) {
        if(pos>=n || pos<0){
            return 0;
        }
        for(int i=pos;i<n;i++){
            a[i] = a[i+1];
        }
        return n-1;
    }


    private static void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;
        int n = 4;
        int item = 5;
        int pos = 4;
        n = insertAtPos(arr, n, item, pos);
        print(arr,n);

        pos = 2;
        n = deleteAtPos(arr,n,pos);
        print(arr, n);


    }
}
