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
    
}
