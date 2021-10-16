package wipro;
/*
N = 4
First = W
W B W B
B W B W
W B W B
B W B W
*/
public class Robosoft {
    static void line1(int N, char f,char s){
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                System.out.print(f+" ");
            }else{
                System.out.print(s+" ");
            }
        }
        System.out.println();
    }
    static void line2(int N, char f, char s){
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.print(s+" ");
            }else{
                System.out.print(f+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N = 5;
        char f = 'W';
        char s = 'B';
        //Identify the first and second character
        if (f == 'B') {
            s = 'W';
        }
        // Acc. to N value calling the respective functions
        /*
        if(N%2==0){
            for(int i=1;i<=N/2;i++){
                line1(N, f, s);
                line2(N, s, f);
            }
        }else{
            for(int i=1;i<=N/2;i++){
                line1(N, f, s);
                line2(N, s, f);
            }
            line1(N, f, s); // for odd, print extra line
        }
        */
        for(int i=1;i<=N/2;i++){
            line1(N,f, s);
            line2(N, s, f);
        }
        if(N%2!=0){
            line1(N, f, s);
        }
    }
}
