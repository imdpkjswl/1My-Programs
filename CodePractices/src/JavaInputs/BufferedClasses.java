package JavaInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedClasses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter int input");
        String str = br.readLine();
        String[] tmp = str.split(" ");
        int i0 = Integer.parseInt(tmp[0]);
        System.out.println(i0);
        // Or use below one
        int i1 = Integer.parseInt(str);
        System.out.println(i1);

        System.out.println("Enter long input");
        str = br.readLine();
        tmp = str.split(" ");
        long i2 = Long.parseLong(tmp[0]);
        System.out.println(i2);

        System.out.println("Enter float input");
        str = br.readLine();
        tmp = str.split(" ");
        float i3 = Float.parseFloat(tmp[0]);
        System.out.println(i3);

        System.out.println("Enter Double input");
        str = br.readLine();
        tmp = str.split(" ");
        double i4 = Double.parseDouble(tmp[0]);
        System.out.println(i4);

        System.out.println("Enter char input");
        char data = (char)br.read();
        System.out.println(data);


        System.out.println("Enter string input");
        String s = br.readLine();
        String[] tmp1 = s.split(" "); // take single word string
        System.out.println(tmp1[0]);

        System.out.println("Enter string input");
        s = br.readLine();// take entire string
        System.out.println(s);


    }
}
