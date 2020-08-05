import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[][] maze = {
                        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
                        {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
                        {0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                        {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
        };

        /**
         * Arguments: 
         */
	    int result = shortestPath(maze,0,0,0,7);

        if(result >= Integer.MAX_VALUE-100)
            System.out.println("No path possible.");
        else
            System.out.println(result);

    }


    static int shortestPath(int[][] a, int i, int j, int x, int y) {

        int rows = a.length;
        int cols = a[0].length;

        boolean[][] visited = new boolean[rows][cols];

        return shortestPath(a, i, j, x, y, visited);
    }

    static boolean isValid(int[][] a, int i, int j, boolean[][] visited){
        int rows = a.length;
        int cols = a[0].length;

        return i>=0 && j>=0 && i<rows && j<cols && a[i][j] == 1 && !visited[i][j];
    }

    static int shortestPath(int[][] a, int i, int j, int x, int y, boolean[][] visited){
        if(!isValid(a,i,j,visited)) return (Integer.MAX_VALUE-100);

        if(i == x && j == y) return 0;

        visited[i][j] = true; //mark src as visited.
        int left = shortestPath(a, i, j-1, x, y, visited) +1;
        int bottom = shortestPath(a, i+1, j, x, y, visited) +1;
        int right = shortestPath(a, i, j+1, x, y, visited) +1;
        int top = shortestPath(a, i-1, j, x, y, visited) +1;


        // This line makes backtracking work
        visited[i][j] = false;
        return Math.min(Math.min(left,bottom),Math.min(right,top));
    }




}
