package ninja;

/**
 *  0 --> north
 *  1 --> south
 *  The task is to count crossing bikers in such a way that
 *  each pair of crossing bikers(N,S), where 0<=N<S<T, is
 *  passing when N is running to the north and S is running
 *  to the south.
 */
public class RunningBikers {
    public static void main(String[] args) {
        int T = 6;
        int[] arr = new int[]{0, 1, 0, 1, 1, 1};

        int ans = 0;

        for(int i=0;i<T;i++){
            if(arr[i]==0){
                for(int j=i+1;j<T;j++){
                    if(arr[j]==1){
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
