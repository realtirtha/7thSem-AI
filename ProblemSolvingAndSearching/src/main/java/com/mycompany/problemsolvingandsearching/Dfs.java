package com.mycompany.problemsolvingandsearching;
//import java.util.HashMap;
import java.util.LinkedList;

public class Dfs {
    public void dfsSearch(Node start, Graph g){
        LinkedList<Node> neigh;
        
        start.visit();
        
        neigh= g.getAdjacency().get(start);
        
        //or we can also write
        //HashMap<Node,LinkedList<Node>> tmp = g.getAdjacency();
        //neigh = tmp.get(start);
        if(neigh!=null){
            for(Node n:neigh){     
            if(n.isVisited()==false){
                dfsSearch(n,g);
            }
        } 
    }      
}
        
          
}
