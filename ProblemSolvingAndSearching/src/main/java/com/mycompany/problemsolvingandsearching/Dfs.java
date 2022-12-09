package com.mycompany.problemsolvingandsearching;

public class Dfs {
    public void dfsSearch(Node start, Graph g){
        start.visit();
        neigh= g.getAdjacency();
        get(start);
        
        for(Node n:neigh){
            if(!n.isVisited()){
                dfsSearch(n,g);
            }
        }
    }
}
