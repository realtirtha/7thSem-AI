
package com.mycompany.problemsolvingandsearching;
import java.util.LinkedList;

public class Bfs 
{
    public void bfsSearch(Node start,Graph g)
    {
        LinkedList<Node> queue =new LinkedList<Node>();
        queue.add(start);

        while(queue.isEmpty()==false)
        {
            //Node first=queue.getFirst();
            Node first=queue.pop();
            if(!first.visited)
            {
                first.visit();
                LinkedList<Node> neigh= g.getAdjacency().get(first);
                for(Node ne: neigh)
                {
                    if(ne.visited==false )
                    {
                        queue.add(ne);
                    }
                }
            }
        }
    }
}