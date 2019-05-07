package finalproject;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;



public class RandomGraph {
	
	public HashMap<Integer,GraphNodes> nodeLookup = new HashMap<Integer, GraphNodes>();
	
	public class GraphNodes
	{
		public int Nodeid; 
		public int Nodevaule; 
		
		LinkedList<GraphNodes> adjacent = new LinkedList<GraphNodes>();
		
		GraphNodes(int Nodeid, int Nodevalue) 
		{
			this.Nodeid = Nodeid;
			this.Nodeid = Nodevalue;
			
		}
	
	public GraphNodes getGraphNodes(int Nodeid)
	{
		GraphNodes sn = nodeLookup.get(Nodeid);
		return sn;
	}
	
	public void addEdge(int sourceNode, int destinationNode)
	{
		GraphNodes sn = getGraphNodes(sourceNode);
		GraphNodes dn = getGraphNodes(destinationNode);
		
		sn.adjacent.add(dn);

	}
	
		
public boolean hasPathDFS(int sourceNode, int destinationNode)
{
	GraphNodes sn = getGraphNodes(sourceNode);
	GraphNodes dn = getGraphNodes(destinationNode);
    
    
    HashSet<Integer> visited = new HashSet<Integer>();
    return hasPathDFS(sn, dn, visited);
}




public boolean hasPathDFS(GraphNodes sourceNode, GraphNodes destinationNode, HashSet<Integer> visited)
{
    if(visited.contains(sourceNode.Nodeid))
    {
        return false;
    }
    
    visited.add(sourceNode.Nodeid);
    if(sourceNode == destinationNode)
    {
        return true;
    }
    
    for(GraphNodes child : sourceNode.adjacent)
    {
        if(hasPathDFS(child, destinationNode, visited))
        {
            return true;
        }
    }
    return false;                
}

public boolean hasPathBFS(GraphNodes sourceNode, GraphNodes destinationNode)
{
    LinkedList<GraphNodes> nextToVisit = new LinkedList<GraphNodes>();
    HashSet<Integer> visited = new HashSet<Integer>();
    nextToVisit.add(sourceNode);
    
    while(!nextToVisit.isEmpty())
    {
        GraphNodes graphNodes = nextToVisit.remove();
        
        if(graphNodes == destinationNode)
        {
            return true;
        }
        
        if(visited.contains(graphNodes.Nodeid))
        {
            continue;
        }
        
        visited.add(graphNodes.Nodeid);
        
        for(GraphNodes child : graphNodes.adjacent)
        {
            nextToVisit.add(child);
        }
    }
    
    return false;
}
}



}
	
		
		
		
    


