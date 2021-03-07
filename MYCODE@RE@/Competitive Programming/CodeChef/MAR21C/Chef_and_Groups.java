import java.math.*;
import java.util.*;
import java.lang.*;

class Chef_and_Groups {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;
        if (in.hasNextInt()) {
            T = in.nextInt();
        }

        for (int t = 1; t <= T; t++) {
            String str = in.next();
            int group = 0;

            for (int i = 0; i < str.length(); ) {

                if (str.charAt(i) == '1') {
                    group++;
                    while (i < str.length() && str.charAt(i) != '0') {
                        i++;
                    }
                } else {
                    i++;
                }

            }

            System.out.println(group);

        }
    }
}

