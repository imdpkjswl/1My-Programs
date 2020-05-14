/// check-undirected-graph-contains-cycle-not


//Here is simple code for BFS  just check this condition
// For every visited vertex ‘v’, if there is an adjacent ‘u’ such that u is already visited and u is not a parent of v, then there is a cycle in the graph. If we don’t find such an adjacent for any vertex, we say that there is no cycle.

#include <bits/stdc++.h>
using namespace std;

const int M = 1001 ;      // number of nodes
vector<int> vec[M];       // adjacency list to store graph
bool vis[M];
int par[M];               // stores parent of each node according to bfs traversal

bool cycle_check(){
    par[1] = 0;            // start bfs from any node I have started from 1
    queue<int> Q;
    Q.push(1);

    while(!Q.empty()){
        int u = Q.front();
        Q.pop();
        for(int i = 0 ; i<vec[u].size() ; i++){
            int v = vec[u][i];
            if(par[v]==u)
                continue;
            else if(vis[v]==1){
                return true;            // there is a node v that is not parent of this node u so there is a cycle
            }
            par[v] = u;              // set u as parent of v
            vis[v] = 1;
            Q.push(v);              // push v in queue
        }
    }
    return false;
}
int main(){
    int n,m;     // n- nodes   m-edges
    //cin>>n;
    cout<<"Enter the number of edges in graph"<<endl;
    cin>>m;
    // nodes numbered from 1 to n
    for(int i = 0 ; i<m ; i++){
        int u , v;
        cin>>u>>v;
        vec[u].push_back(v);       // construct undirected graph
        vec[v].push_back(u);
    }
    if(cycle_check()){
        cout<<"Cycle present"<<endl;
        return 0;
    }
    else{
        cout<<"Cycle not present"<<endl;
        return 0;
    }
}
