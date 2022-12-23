package com.mycompany.problemsolvingandsearching;

/**
 *
 * @author Tirth
 */
public class Node {
    int NodeID;
    String name;
    boolean visited;
    
    public Node(int id, String city, boolean visit){
        NodeID=id;
        name=city;
        visited=visit;
    }
    
    public String getName(){
        return name;
    }
    
    public void visit(){
        System.out.println(name);
        visited = true;
    }
    
    public boolean isVisited(){
        return visited;
    }
}
