import java.util.*;

public class Persistent {
        static void subString(char[] str, String t) {
            int n = str.length;
            int ans = 0;
            for (int len = 1; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    String temp = "";
                    for (int k = i; k <= j; k++) {
                        temp +=  str[k];
                        //System.out.print(str[k]);
                    }
                    //System.out.println(temp);
                    if(temp.equalsIgnoreCase(t)){
                        ans++;
                    }
                    //System.out.println();

                }
            }

            System.out.println(ans);
        }

        public static void main(String args[]) {
            String secretMsg = "TimisplayingthehouseofTimwiththetoysofTim";
            String terrorist = "Tim";
            //System.out.println(subString(secretMsg, terrorist););
            subString(secretMsg.toCharArray(), terrorist);
        }
}

/*
Find the no. of occurrence of key in the given text string:
Input: TimisplayingthehouseofTimwiththetoysofTim
key: Tim (Ignore cases)

Output: 3
*/


