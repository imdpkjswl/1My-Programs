import java.util.Scanner;

public class asad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = 12345; //sc.nextLong();

        if(num<10 || num>1000000){
            System.out.println("wrong answer");
        }
        else
        {
            String ans = "";
            while(num>0){
                long tmp = num%10;
                num /= 10;
                tmp = tmp*tmp;
                ans += tmp;
            }

            System.out.println(ans);
        }

    }
}

/*
class asad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "apple";
        String b = "eapl";


        String ans = "";

        for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
                if(b.charAt(i) == a.charAt(j)){
                    ans += b.charAt(i);
                }
            }
        }

        System.out.println(ans);
    }
}

 */