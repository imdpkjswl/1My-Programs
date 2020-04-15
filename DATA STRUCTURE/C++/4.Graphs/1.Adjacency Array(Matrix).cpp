#include<iostream>
#define V 5
using namespace std;

//init matrix to 0
void init(int arr[][V+1])
{
    int i,j;
    for(i = 1; i <= V; i++)
        for(j = 1; j <= V; j++)
            arr[i][j] = 0;
}

//Add edge. set arr[src][dest] = 1
void addEdge(int arr[][V+1],int src, int dest)
{
     arr[src][dest] = 1;
}

void printAdjMatrix(int arr[][V+1])
{
     int i, j;

     for(i = 1; i <= V; i++)
     {
         for(j = 1; j <= V; j++)
         {
             printf("%d ",arr[i][j]);
         }
         cout<<endl;
     }
}

//print the adjMatrix
int main()
{
    int adjMatrix[V+1][V+1];

    init(adjMatrix);
    addEdge(adjMatrix,1,3);
    addEdge(adjMatrix,2,3);
    addEdge(adjMatrix,3,3);
    addEdge(adjMatrix,4,3);
    addEdge(adjMatrix,5,3);

    cout<<"The Adjacency Matrix:"<<endl;
    printAdjMatrix(adjMatrix);

    return 0;
}
