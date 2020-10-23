import java.util.*;


// Solution is Working But Getting NZEC (Non-Zero Exit Code error) during taking input from console.
class HALLOWEEN_EVE {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=0, k=0;
        
        if(in.hasNextInt()){
            n = in.nextInt();
            k = in.nextInt();
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int[] tmp = new int[k];

        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }


        Collections.sort(arr);

        for(int i=0;i<k;i++){
            tmp[i] = arr.get(i);
        }

        int hmin = tmp[0];
        int hmax = tmp[k-1];

        System.out.println(hmax-hmin);
    }
}