package ninja;

public class Two_Four_Wheeler {
    public static void main(String[] args) {
        int v, w;

        v = 200;
        w = 540;

        if(2<=w && w%2==0 && v<w){
            int x = (w-2*v)/2; // four wheeler
            int y = v-x; // two-wheeler
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println("INVALID INPUT");
        }
    }
}
