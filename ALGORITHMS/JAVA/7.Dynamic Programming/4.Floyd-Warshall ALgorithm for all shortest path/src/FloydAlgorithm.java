import java.util.*;


public class FloydAlgorithm {
    static int[][] costMat = new int[20][20];
    static int[][] distMat = new int[20][20];

    static void allPairShortestPath(int n){

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                distMat[i][j] = costMat[i][j];


        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i != j)  // ignoring self loop position
                        distMat[i][j] = Math.min(distMat[i][j], distMat[i][k]+distMat[k][j]); // Here, k is a intermediate vertex,Look Abdul bari lecture
                }
            }
        }
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the no. of vertices:");
        n=in.nextInt();

        System.out.println("Enter the cost adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                costMat[i][j]= in.nextInt();
                if(costMat[i][j] == 0)
                    costMat[i][j] = 999;
            }
        }

        allPairShortestPath(n);

        System.out.println("The Distance Matrix: ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(distMat[i][j] == 999)
                    distMat[i][j] = 0;
                System.out.print(distMat[i][j] + "  ");
            }
            System.out.println();
        }




    }

}
