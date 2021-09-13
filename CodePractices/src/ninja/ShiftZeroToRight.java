package ninja;

public class ShiftZeroToRight {
    public static void main(String[] args) {
        int [] arr = {1,0,4,0,2};
        int n = arr.length;

        int[] ans = new int[n];
        int z=0, k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                z++;
            else
                ans[k++] = arr[i];
        }
        for(;k<n;k++){
            ans[k] = 0;
        }

        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
