public class Main {

    public static void main(String[] args) {

        skipOuter:
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==3)
                    continue skipOuter; // It skipped out loop, when condition satisfied.
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
