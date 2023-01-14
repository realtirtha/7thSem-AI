package com.mycompany.problemsolvingandsearching;

import java.util.HashMap;
import java.util.LinkedList;
/**
 *
 * @author Tirth
 */
public class Graph {
    HashMap<Node,LinkedList<Node>>adjacencyMap;
    boolean directed;
    
    public Graph(boolean dir){
    adjacencyMap = new HashMap<>();
    directed= dir;
}

    
    //inserting edges for nodes
    public void insertEdge(Node source, Node target){
        if(!adjacencyMap.keySet().contains(source)){
            LinkedList<Node> tmp= new LinkedList<>();
            tmp.add(target);
            adjacencyMap.put(source, tmp);
        }
        else{
            LinkedList<Node> tmp = adjacencyMap.get(source);
            tmp.add(target);
            adjacencyMap.put(source, tmp);
        }
    }
    
    //function to print edges
    public void printEdges(){
        for(Node n:adjacencyMap.keySet()){
            LinkedList<Node> tmp = adjacencyMap.get(n);
            System.out.println(n.getName() + ": ");
            for(Node n1:tmp){
                System.out.println(n1.getName());
            }
            
            System.out.println();
        }
        System.out.println();
    }
    
    public HashMap<Node,LinkedList<Node>> getAdjacency(){
        return adjacencyMap;
    }
    
    
}
