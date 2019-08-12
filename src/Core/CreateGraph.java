package Core;

import java.util.LinkedList;

public class CreateGraph {
	public int V;   // No. of vertices 
	  
    // Array  of lists for Adjacency List Representation 
    public LinkedList<Integer> adj[]; 
    public boolean visited[];
    // Constructor 
    CreateGraph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        visited=new boolean[v];
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
    } 
    
}
