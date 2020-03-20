public class Main {

    public static void main(String[] args) {

        int i,j,n,left,right;
        n=5;
        int m=9;
        left=1;
        right=9;

        for(i=1;i<=n;i++){ // Rows
            for(j=1;j<=m;j++) { // Column
                if (j >= left && j <= right)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            left++;
            right--;
            System.out.println();
        }
    }
}
