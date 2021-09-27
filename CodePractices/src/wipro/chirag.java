package wipro;

/*
import java.util.*;
public class chirag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d, min, max;
        d = sc.nextInt();
        min = sc.nextInt();
        max = sc.nextInt();

        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = sc.nextInt();
        }

        HashSet<Integer> s = new HashSet<>();
        for(int i=min;i<=max;i++){
            s.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<d;i++){
            if(!s.contains(temp[i])){
                ans.add(temp[i]);
            }
        }

        for(int val: ans){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
*/



import java.util.*;

class chirag{

    static int largest(int num){
        int l = 0;
        while (num > 0) {
            int r = num % 10;
            if (l < r) {
                l = r;
            }
            num = num / 10;
        }

        return l;
    }

    static int  second(int n){
        int a =0, b =0;

        while(n!=0) {
            int digit=n%10;
            if(digit>a) {
                b=a;
                a=digit;
            } else if(digit>b) {
                b = digit;
            }
            n=n/10;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int big=0;
        int small=0;
        big = largest(n1) + largest(n2) + largest(n3);
        small = second(n1) + second(n2) + second(n3);

        System.out.println(big-small);

    }
}
