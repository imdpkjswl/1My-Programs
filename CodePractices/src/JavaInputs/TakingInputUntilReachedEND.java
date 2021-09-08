package JavaInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputUntilReachedEND {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "END";
        while(!str.isEmpty()){ // !(str.isBlank())
            str = br.readLine();
            System.out.println(str);
        }

        System.out.println("Reached END");

    }
}
