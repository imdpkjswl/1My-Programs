import java.io.*;
import java.util.*;
/* LOGIC CORRECT BUT SHOWING WRONG ANSWER
class ProblemDifficulties {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int a1, a2, a3, a4;

            String str = br.readLine(); // read whole line
            String[] a = str.split(" "); // separate line by space

            a1=Integer.parseInt(a[0]);
            a2=Integer.parseInt(a[1]);
            a3=Integer.parseInt(a[2]);
            a4=Integer.parseInt(a[3]);

            HashSet<Integer> s = new HashSet<>();
            s.add(a1); s.add(a2); s.add(a3); s.add(a4);

            int n = s.size();
            if(n==1){
                System.out.println("0");
            }else if(n==2){
                System.out.println("1");
            }else{
                System.out.println("2");
            }
        }

    }
}
*/

class ProblemDifficulties {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int a1, a2, a3, a4;

            String str = br.readLine(); // read whole line
            String[] a = str.split(" "); // separate line by space

            int[] arr = new int[4];

            a1=Integer.parseInt(a[0]);
            a2=Integer.parseInt(a[1]);
            a3=Integer.parseInt(a[2]);
            a4=Integer.parseInt(a[3]);

            arr[0] = a1;
            arr[1] = a2;
            arr[2] = a3;
            arr[3] = a4;

            Arrays.sort(arr);

            if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]){
                System.out.println("0");
            }else if(arr[0]==arr[1] && arr[1]==arr[2] || arr[1]==arr[2] && arr[2]==arr[3]){
                System.out.println("1");
            }else{
                System.out.println("2");
            }
        }

    }
}

