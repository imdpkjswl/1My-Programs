package wipro;

import java.util.*;

class shetty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n; // n-players
        n = 5;//sc.nextInt();
        int[] s = {15, 5, 3, 7, 9};//new int[n]; // scores
        int h1, h2;   // health of pillar

        //for(int i=0;i<n;i++){ s[i] = sc.nextInt(); }
        h1 = 135; //sc.nextInt();
        h2 = 90; //sc.nextInt();

        int ans = 0;
        for(int i=0;i<n;i++){
            if(h1%s[i]==0 && h2%s[i]==0){
                ans++;
            }
        }

        System.out.println(ans);

    }
}

/*
public class shetty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {count++;}
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
    }
}
*/