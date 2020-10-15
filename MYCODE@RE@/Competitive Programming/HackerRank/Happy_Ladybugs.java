import java.util.*;

public class Happy_Ladybugs {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 7;
        String str = "RBY_YBR";

        String result = solution(str);
        System.out.println(result);
    }

    // 3/12 test cases failed due to, If ladybugs are already happy,example: RRBBYY
    private static String solution(String str) {
        int[] table = new int[96];
        Arrays.fill(table, 0);

        for(int i=0;i<str.length();i++){
            table[(int)str.charAt(i)]++;
        }


        for(int i=0;i<table.length-1;i++) {
            if(table[i] < 2 && table[i] != 0) {
                return "NO";
            }
            else if(table[i] >= 2 && table[table.length-1] == 0) {
                return "NO";
            }
        }

        return "YES";
    }
}
