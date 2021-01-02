import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Encoded_String {
    static char[] table = new char[26];

    private static int binToDec(String binaryString) {
        return Integer.parseInt(binaryString,2);
    }

    private static String decodeit(int n, String str) {
        String res = "";
        String binaryString = "";
        for(int i=0;i<n;i++){
            binaryString += str.charAt(i);
            if((i+1)%4==0){
                int index = binToDec(binaryString);
                res += table[index];
                binaryString = "";
            }
        }

        return res;
    }

    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<26;i++){
            table[i] = (char)(97+i);
        }
        int T=0; if(in.hasNextInt()){ T = in.nextInt(); }
        for(int t=1;t<=T;t++) {
            int N = 0;if (in.hasNextInt()) { N = in.nextInt(); }
            String str = ""; if(in.hasNext()) { str = in.next(); }


            String result = decodeit(N, str);
            System.out.println(result);
        }

    }
}
