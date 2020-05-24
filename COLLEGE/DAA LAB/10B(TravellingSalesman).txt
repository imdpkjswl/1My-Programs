import java.util.*;

public class TravellingSalesmanProblem
{
    static Scanner s = new Scanner(System.in);
    Stack<Integer> stack;

    public TravellingSalesmanProblem()
    {
        stack = new Stack<Integer>();
    }

    public void tsp(int adjacencyMatrix[][], int xy)
    {
        int i,ii,min,src,dst=0,temp=0,cost=0,sum=0,temporary,numberOfNodes,element,visited[];
        boolean minFlag = false;

        numberOfNodes = xy;
        visited= new int[numberOfNodes + 1];

        System.out.println("Enter The Source Vertex");
        src=s.nextInt();

        visited[src] = 1;
        stack.push(src);

        System.out.println("The Cities Are Visited In The Following Optimal Order As Shown Below");
        System.out.print(src+"-->");

        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = src;
            min = Integer.MAX_VALUE;

            if(i!=1)
                temporary=numberOfNodes+(i-1);
            else
                temporary=numberOfNodes;

            while (i <= temporary)
            {
                ii=temporary-(i-1);
                if (adjacencyMatrix[element][ii] > 1 && visited[ii] == 0)
                {
                    if (min > adjacencyMatrix[element][ii])
                    {
                        min = adjacencyMatrix[element][ii];
                        dst = ii;
                        minFlag = true;
                        cost=min;
                    }
                }
                i++;
            }

            if (minFlag)
            {
                visited[dst] = 1;
                stack.push(dst);
                temp=dst;
                sum+=cost;
                System.out.print(dst+"-->");
                minFlag = false;
                continue;
            }
            stack.pop();
        }

        System.out.println(src);
        System.out.println("The Optimal Trip Cost Is "+(sum+adjacencyMatrix[temp][src]));
    }

    public static void main(String[]args)
    {
        int number_of_nodes,adjacency_matrix[][];

        System.out.println("Enter The Number Of Nodes In The Graph");
        number_of_nodes = s.nextInt();

        adjacency_matrix = new int[number_of_nodes + 1][number_of_nodes + 1];

        System.out.println("Enter The Values Into The Adjacency Matrix");

        for (int i = 1; i <= number_of_nodes; i++)
        {
            for (int j = 1; j <= number_of_nodes; j++)
            {
                adjacency_matrix[i][j] = s.nextInt();
            }
        }

        TravellingSalesmanProblem t = new TravellingSalesmanProblem();
        t.tsp(adjacency_matrix,number_of_nodes);
    }
}