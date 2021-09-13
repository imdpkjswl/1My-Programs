package ninja;

public class MaxGuest {
    public static void main(String[] args) {
        int n = 5;
        int[] E = {7, 0, 5, 1, 3};
        int[] L = {1, 2, 1, 3, 4};

        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + E[i] - L[i];
            //System.out.printf("%d - %d - %d",sum,E[i],L[i]);
            //System.out.println();
            max = sum>max?max=sum:max;
        }

        System.out.println(max);
    }
}
