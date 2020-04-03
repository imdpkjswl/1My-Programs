import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        int []arr = new int[50];

        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(20);
        }

        for(int i : arr)
            System.out.print(i+",  ");
    }
}
