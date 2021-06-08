import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HOW_TO_READ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        String s = br.readLine();

        String[] s1 = s.split(" ");
        int a1, a2;
        a1=Integer.parseInt(s1[0]);
        a2=Integer.parseInt(s1[1]);

        System.out.println(a1+a2);


    }
}