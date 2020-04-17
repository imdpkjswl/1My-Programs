import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n,i,j,count=1;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the no. of terms");
	n = in.nextInt();

	for(i=1;i<=n;i++){
	    for(j=1;j<=count;j++){
            System.out.print("2");
        }
	    if(i== n)
	        break;

            if (count != 0)
                System.out.print(", ");

        count++;
    }


    }
}
