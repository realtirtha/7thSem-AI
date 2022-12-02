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
}
