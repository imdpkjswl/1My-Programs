public class Main {

    public static void main(String[] args) {

        getOutFromLoop:
        for(int i=0; i<5;i++){
            for(int j=0;j<5;j++){
                if(i==3)
                    break getOutFromLoop;

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
