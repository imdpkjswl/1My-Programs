import java.util.*;


public class WarshallAlgorithm {
    static int[][] adjMat = new int[20][20];
    static int[][] pathMat = new int[20][20];

    static void reachableMatrix(int n){

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                pathMat[i][j] = adjMat[i][j];


        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(pathMat[i][j] == 0 && pathMat[i][k]==1 && pathMat[k][j]==1 )
                        pathMat[i][j] = 1; // filling 1, when ith row and jth column is 1
                }
            }
        }
    }

    public static void main(String [] args){
       Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the no. of vertices:");
        n=in.nextInt();

        System.out.println("Enter the adjacency matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                adjMat[i][j]= in.nextInt();

        reachableMatrix(n);

        System.out.println("The Reachable Matrix: ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pathMat[i][j] + "  ");
            }
            System.out.println();
        }


        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(pathMat[i][j] == 1){
                    System.out.printf("%d is reachable from:  %d",(i+1),(j+1));
                    System.out.println();
                }
            }
        }



    }

}
