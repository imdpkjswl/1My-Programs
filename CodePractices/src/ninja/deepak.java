import  java.util.*;
public  class deepak{
    public static void main(String[] args) {
        String[] m = {"jan", "feb","mar","apr","may","jun","july","aug","sep","oct","nov","dec"};
        int n = 4;

        if(n<=0 || n>=12){
            System.out.println("invalid month");
        }else{
            System.out.println(m[n-1]);
        }
    }
}



/*
public class deepak {
    static int count=0;
    static int deepak(int num, int s){
        int t= num;
        if(num==0 && s==0){
            count++;
            return 0;
        }
        while(num>0){
            int tmp  = num%10;
            num/=10;
            if(tmp==s){
                count++;
                return t;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int s = 5;


        for(int i=0;i<=n;i++){
            int ans = deepak(i,s);

            if(ans!=-1){
                System.out.print(ans+" ");
            }
        }
        System.out.println(count);




    }
}
*/