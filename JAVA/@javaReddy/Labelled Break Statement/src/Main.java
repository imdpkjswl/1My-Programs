public class Main {

    public static void main(String[] args) {

        deepak:    // for breaking outer loop, we used labelled break.
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==3)
                    break deepak;
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
