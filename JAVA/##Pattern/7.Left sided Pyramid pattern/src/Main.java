import java.lang.*;

public class Main {

    public static void main(String [] args) {

        int size=4,i,j;

        for(i=size;i>=-size;i--) {
            for(j=size;j>=Math.abs(i);j--)
                System.out.print("* ");

            System.out.println();
        }
    }
}
