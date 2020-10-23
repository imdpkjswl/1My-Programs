import java.util.*;

public class RAJANA_QUIZ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =0;
        if(in.hasNextInt())
            n = in.nextInt();

        int dupCount =0;
        HashSet<ArrayList<Integer>> s = new HashSet<ArrayList<Integer>>();


        for(int j=0;j<n;j++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                tmp.add(in.nextInt());
            }
            Collections.sort(tmp);
            if(s.contains(tmp)){
                dupCount++;
            }else
                s.add(tmp);
        }

        int result = s.size()-dupCount;
        System.out.println(result);

    }
}