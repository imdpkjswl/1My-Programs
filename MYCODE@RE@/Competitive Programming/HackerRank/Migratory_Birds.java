import java.util.*;

public class Migratory_Birds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        if (arr.isEmpty()) {
            return 0;
        }
        int[] table = new int[10];
        Arrays.fill(table, 0);

        // Store frequency of elements
        for (int i = 0; i < arr.size(); i++) {
            table[arr.get(i)]++;
        }

        for (int i : table)
            System.out.print(i + " ");

        int max = Integer.MIN_VALUE, ans = 0;
        // Extracting min value which repeated max times.
        for (int i = 0; i < table.length; i++) {
            if (table[i] > max) {
                max = table[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 11;
        List<Integer> birds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            birds.add(in.nextInt());
        }


        int ans = migratoryBirds(birds);
        System.out.println(ans);
    }
}
