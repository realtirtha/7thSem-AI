package com.mycompany.problemsolvingandsearching;

/**
 * @author Tirth
 */

public class ProblemSolvingAndSearching {

    public static void main(String[] args) {
        Node n1= new Node(1,"Arad",false);
        Node n2= new Node(2,"Zerind",false);
        Node n3= new Node(3, "Sibiu",false);
        Node n4= new Node(4, "Timisoara",false);
        Node n5= new Node(5,"Oradea",false);
        Node n6= new Node(6,"Lugoj",false);
        Node n7= new Node(7,"Mehadia",false);
        Node n8= new Node(8,"Dobreta",false);
        Node n9= new Node(9,"Craiova",false);
        Node n10= new Node(10,"Rimnicu Vilcea",false);
        Node n11= new Node(11,"Fagaras",false);
        Node n12= new Node(12,"Pitesti",false);
        Node n13= new Node(13,"Bucharest",false);
        Node n14= new Node(14,"Giurgui",false);
        Node n15= new Node(15,"Urziceni",false);

        Graph graph= new Graph(false);
        
        //inserting edges for Arad n1
        graph.insertEdge(n1,n2);
        graph.insertEdge(n1,n3);
        graph.insertEdge(n1,n4);
        
        //inserting edges for zerind n2
        graph.insertEdge(n2,n1);
        graph.insertEdge(n2,n5);
        
        //inserting edges for sibui n3
        graph.insertEdge(n3,n1);
        graph.insertEdge(n3,n10);
        graph.insertEdge(n3,n11);
        
        //inserting edges for Timisoara n4
        graph.insertEdge(n4,n1);
        graph.insertEdge(n4,n6);
        
        //inserting edges for Oradea n5
        graph.insertEdge(n5,n2);
        graph.insertEdge(n5,n3);
        
        //inserting edges for Lugoj n6
        graph.insertEdge(n6,n4);
        graph.insertEdge(n6,n7);
        
        //inserting edges for Mehadia n7
        graph.insertEdge(n7,n6);
        graph.insertEdge(n7,n8);
        
        //inserting edges for Dobreta n8
        graph.insertEdge(n8,n7);
        graph.insertEdge(n8,n9);
        
        //inserting edges for Craiova n9
        graph.insertEdge(n9,n8);
        graph.insertEdge(n9,n10);
        graph.insertEdge(n9,n12);
        
        //inserting edges for Rimnicu Vilcea n10
        graph.insertEdge(n10,n3);
        graph.insertEdge(n10,n9);
        graph.insertEdge(n10,n12);
        
        //inserting edges for Fagaras n11
        graph.insertEdge(n11,n3);
        graph.insertEdge(n11,n13);
        
        //inserting edges for Pitesti n12
        graph.insertEdge(n12,n9);
        graph.insertEdge(n12,n10);
        graph.insertEdge(n12,n13);
        
        //inserting edges for Bucharest n13
        graph.insertEdge(n13,n11);
        graph.insertEdge(n13,n12);
        graph.insertEdge(n13,n14);
        graph.insertEdge(n13,n15);
        
        //inserting edges for Giurgui n14
        
        //inserting edges for Urziceni n15
        
        

        graph.printEdges();
    }
    
    
}
