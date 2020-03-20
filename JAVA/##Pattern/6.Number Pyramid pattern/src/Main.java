public class Main {

    public static void main(String[] args) {

        int i,j,n=5;
        int l,r;
        l=r=5;
        int digit=1;

        for(i=1;i<=n;i++){
            for(j=1;j<=(2*n);j++){
                if(j>=l && j<=r) {
                    System.out.print(digit);
                }
                else
                    System.out.print(" ");

            }
            digit++;
            l--;
            r++;
            System.out.println();
        }
    }
}
