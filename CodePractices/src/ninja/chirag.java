import java.util.*;
/*
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int k = sc.nextInt();

        int count=0;

        while(num>0){
            count++;
            num /= 10;
        }

        if(count==k){
            System.out.println("True "+count);
        }else{
            System.out.println("False "+count);
        }


    }
}
*/



class chirag {
    static int ans = 0;
    static void sum(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if(count%2==0){
                ans += count;
            }
            //System.out.print(s.charAt(i)+ "" + count + " ");
        }

        //System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sum(s);
        System.out.println(ans);
    }
}