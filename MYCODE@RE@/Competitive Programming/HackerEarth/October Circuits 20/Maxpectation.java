//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

// 100% Working
class Maxpectation {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m=in.nextInt();

        int arr[] = new int[2*m];
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> temp = new HashSet<Integer>();
        for(int i=0;i<2*m;i++){
            arr[i] = in.nextInt();
            s.add(in.nextInt());
        }

        for(int i=0;i<2*m;i++){
            if(s.contains(arr[i]) && !temp.contains(arr[i])){
                temp.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }

    }
}


/*
Example:
SAMPLE INPUT 
5 4
3 4
4 5
2 3
5 1
2 5
4 2
1 3
5 1

SAMPLE OUTPUT 
3 4 2 5 1

First line contains two integers n,m , number of graph's vertices and number of graph's edges.
Each of the following m lines contains vi,ui separated space describing first graph's th edge's vertices(vi,ui).
Each of the next following m lines contains vi,ui separated space describing second graph's ith edge's vertices(vi,ui).
It is guaranteed that there is no multiple edges or self loops in the graph and the graph is connected.
*/