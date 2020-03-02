#include<stdio.h>
#include<stdlib.h>

int a[100][100],n,visit[100];
int q[100],front=-1,rear=-1;  /// BFS implemented by Queue
int s[100],top=-1;           ///  DFS implemented by Stack
int temp=0;

void matrix()
{
    int i,j;

    printf("Enter the Number Of Vertex\n");
    scanf("%d",&n);
    printf("Enter the Adjacency Matrix\n");

    for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
            scanf("%d",&a[i][j]);


        printf("Adjacency Matrix Created Successfully\n");
}

void bfs(int start)
{
    int u,v;
    visit[start]=1;
    q[++rear]=start;

    while(front!=rear)
    {
        u=q[++front];

        for(v=1;v<=n;v++)
        {
            if((a[u][v]==1)&& visit[v]==0)
            {
                q[++rear]=v;
                visit[v]=1;
                printf("%d Reachable From %d\n",v,start);
            }
        }
    }
}

void dfs(int start)
{
    int v;
    visit[start]=1;
    s[++top]=start;

    for(v=1;v<=n;v++)
    {
        if((a[start][v]==1) && visit[v] == 0)
        {
            printf("%d Reachable From %d\n",v,start);
            dfs(v);
            ++temp;
        }
    }
}

void main()
{
    matrix();
    int choice,v,start;

    for(;;)
    {
        printf("1: BFS Traversal\n");
        printf("2: DFS Traversal\n");
        printf("3: Exit\n");
        printf("Enter Your Choice\n");
        scanf("%d",&choice);

        switch(choice)
        {

            case 1:
                    for(v=1;v<=n;v++)
                        visit[v]=0;

                printf("Enter The Starting Vertex\n");
                scanf("%d",&start);

                bfs(start);

                for(v=1;v<=n;v++)
                {
                    if(visit[v]==0)
                        printf("%d Not Reachable From %d\n",v,start);
                }
                break;

            case 2:
                for(v=1;v<=n;v++)
                    visit[v]=0;
                printf("Enter The Starting Vertex\n");
                scanf("%d",&start);
                dfs(start);
                if(temp==0)
                {
                    for(v=1;v<=n;v++)
                        if(v==start)
                            continue;

                        printf("%d Not Reachable From %d\n",v,start);
                }
                break;

            case 3:
                printf("Thank You\n");
                exit(0);

            default: printf("Invalid Input Entered\n");
        }
    }
}
