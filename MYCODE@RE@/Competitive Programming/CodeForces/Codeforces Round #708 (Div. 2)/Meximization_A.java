import java.util.*;
//Meximization
/* Example:
input
3
7
4 2 0 1 3 3 7
5
2 2 8 6 9
1
0

output
0 1 2 3 4 7 3
2 6 8 9 2
0
*/
public class Meximization_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int k=1;k<=t;k++) {
            int n = in.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();

            // Take input
            for(int i=0;i<n;i++){
                a.add(in.nextInt());
            }

            int[] table = new int[101];
            Arrays.fill(table, 0);
            for (int i = 0; i < a.size(); i++) {
                table[a.get(i)]++;
            }

            int maxIteration = 0;
            for (int i = 0; i < table.length; i++) {
                if (maxIteration < table[i]) {
                    maxIteration = table[i];
                }
            }


            for (int j = 1; j <= maxIteration; j++) {
                for (int i = 0; i < table.length; i++) {
                    if (table[i] != 0) {
                        b.add(i);// add values
                        table[i] -= 1; // decrease frequency
                    }
                }
            }

            for (int val : b) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
