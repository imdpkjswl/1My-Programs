import java.util.*;

class Smallest_Number_With_No_Adjacent_Duplicates {
    public String solve(String s) {
        char[] c = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (c[i] != '?')
                continue;
            
            boolean[] b = new boolean[3];
            
            if (i > 0)
                b[c[i - 1] - '1'] = true;
            
            if (i < n - 1 && c[i + 1] != '?')
                b[c[i + 1] - '1'] = true;
            
            for (int j = 0; j < 3; j++) {
                if (!b[j]) {
                    c[i] = (char) (j + '1');
                    break;
                }
            }
        }
        return new String(c);
    }


    public static void main(String[] args) {
        Smallest_Number_With_No_Adjacent_Duplicates week34 = new Smallest_Number_With_No_Adjacent_Duplicates();

        String s = "?3?2??";

        String ans = week34.solve(s);
        System.out.println(ans);
    }
}


/*
Intuition:
Since the number 1333 is smaller than the number 2111 for example, we always want to 
minimize the left most digit that can be minimized, to get the smallest number. We 
solve this greedily. If the current digit is a question mark, we check the digit on 
the left and on the right and set it to be the smallest untaken digit.

Implementation:
My code maintains the string in a character array and sweeps from left to right. When 
a question mark is updated to a new value, my code updates the array (since this update 
will affect the next index).

At the end, my code turns the array back into a string and outputs that string.

Example:
"3?2??"
My code skips the indices which aren't question marks (i.e. index 0 and 2).
On index 1 it sets the character to 1, so the string becomes "312??".
On index 3 it sets the character to 1, so the becomes "3121?".
On index 4 it sets the character to 2 (since 1 is taken), and the final answer is "31212".

Time Complexity:
O(n) because of the linear sweep through the string.

Space Complexity:
O(n) because we maintain a character array of the new string we build.
*/