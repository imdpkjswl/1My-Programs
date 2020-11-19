import java.util.*;

class Find_duplicates {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();

        int[] table = new int[n];
        Arrays.fill(table, -1);

        for(int i=0;i<n;i++){
            table[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(table[i] > 0){
                res.add(i);
            }
        }

        if(res.size() == 0){
            res.add(-1);
            return  res;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};

        ArrayList<Integer> r = duplicates(arr, arr.length);
        for (Integer integer : r) {
            System.out.print(integer + "  ");
        }
    }
}
