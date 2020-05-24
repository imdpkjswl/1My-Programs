import java.util.*;

public class Prims {
        /**
         * Constructor which find MCST using Prims Algorithm.
         *  w    - Weighted Matrix
         *  n    - Number of Vertices
         *  src  - Source Vertex
         */

        static void primsAlgorithmImplementation( int[][] w, int n, int src ) {

            // To keep a record of which all vertices have been visited
            int []visited = new int [10];

            int u = 0,          // First vertex
                    v = 0,          // Second vertex
                    count ,             // Counter
                    sum = 0,        // Sum of Cost of Spanning Tree
                    flag = 0,       // To indicate whether MCST exists or not
                    min;            // Cost of Minimum edge

            // Initially, setting all vertices as not visited
            for ( int i = 1; i <= n; i++ ) {
                visited [ i ] = 0;
            }

            visited [ src ] = 1;    // Marking source vertex as visited
            count= 1;                // Initialising counter

            // Iterating through all vertices
            while ( count <= n-1 ) {
                // Setting minimum value to highest i.e. infinity
                min = 999;

                // Traversing through weighted matrix and selecting minimum edge
                // NOTE: Here 'i' & 'j' indicate as source and destination vertices respectively.
                for ( int i = 1; i <= n; i++ ) {
                    for ( int j = 1; j <= n; j++ ) {

                        if ( visited[i] == 1 && visited[j] == 0 ) {
                            if ( i != j && w[i][j] < min ) {
                                min = w [i][j];
                                u = i;
                                v = j;
                            }
                        }
                    }
                }

                visited [v] = 1;        // Marking destination vertex as visited
                sum = sum + min;       // Adding up the cost with current selected edge cost
                count++;              // Incrementing counter

                // Showing the current minimum edge to user
                System.out.println ( u + "->" + v + " = " + min );
            }

            // From 'n' vertices if anyone of the vertex is not visited
            // then MCST does not exist.
            for ( int i = 1; i <= n; i++ ) {
                if ( visited[i] == 0 ) flag = 1;
            }

            if ( flag == 1 )
                System.out.println ( "No spanning tree exist." );
            else
                System.out.println ( "The cost of minimum spanning tree is:  " + sum );
        }


        public static void main ( String[] args ) {

            // To Scan inputs from user
            Scanner scan = new Scanner ( System.in );

            // To store weighted matrix
            int w[][] = new int [ 10 ][ 10 ];

            int src,    // To store source vertex
                    n;    // To store number of vertices

            // Scanning number of vertices in graph
            System.out.print ( "Enter the number of vertices: " );
            n = scan.nextInt();

            // Scanning weighted matrix
            System.out.println ( "Enter the weighted graph: ");
            for ( int i = 1; i <= n; i++ ) {
                for ( int j = 1; j <= n; j++ ) {
                    w [ i ][ j ] = scan.nextInt();
                    if(w[i][j] == 0)
                        w[i][j] = 999;   // make zero as 999 i.e. infinity
                }
            }

            // Scanning source vertex
            System.out.print ( "Enter the source vertex: " );
            src = scan.nextInt();  // This is optional in Prim's algorithm,we can make default src vertex.

            // Calling Prims Algorithm Function
            primsAlgorithmImplementation(w,n,src);

        }

}
