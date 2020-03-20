public class Main {

    public static void main(String[] args) {

        int i,j,n,l,r;
        n=l=r=5;

        for(i=1;i<=n;i++){ // Rows
            for(j=1;j<=2*n-1;j++){ // Column


                if(j>=l && j<=r ){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            l--;
            r++;
            System.out.println();
        }
    }
}