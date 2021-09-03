import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeArrayInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // read a whole line
        String[] sArr = str.split(" "); // separate by single space

        int[] arr = new int[sArr.length]; // create integer array

        // Transfer string element to integer by parsing
        for(int i=0;i<sArr.length;i++){
            arr[i] = Integer.parseInt(sArr[i]);
        }

        // Finally, print all elements
        for(int item : arr){
            System.out.print(item+"  ");
        }

    }
}
