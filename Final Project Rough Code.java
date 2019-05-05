package finalproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



 
public class Graphs 
{
    private Map<Integer, List<Integer>> adjacencyList;

 
    public Graphs(int v) 
    {
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= v; i++)
            adjacencyList.put(i, new LinkedList<Integer>());
    }

 
    public void setEdge(int to, int from) 
    {
        if (to > adjacencyList.size() || from > adjacencyList.size())
            System.out.println("The vertices's does not exists");

 
        List<Integer> sls = adjacencyList.get(to);
        sls.add(from);
        List<Integer> dls = adjacencyList.get(from);
        dls.add(to);
    }

 
    public List<Integer> getEdge(int to) 
    {
        if (to > adjacencyList.size()) 
        {
            System.out.println("The vertices's does not exists");
            return null;
        }
        return adjacencyList.get(to);
    }

 
    public static void main(String args[]) 
    {
        System.out.println("Enter the number of edges: ");

 
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        try 
        {
            int minV = (int) Math.ceil((1 + Math.sqrt(1 + 8 * e)) / 2);
            int maxV = e + 1;

 
            Random random = new Random();
            int v = Math.abs(random.nextInt(maxV - minV) + minV);
            System.out.println("Random graph has "+v+" vertices's");

 
            Graphs reg = new Graphs(v);
            int count = 1, to, from;
            while (count <= e) 
            {
                to = Math.abs(random.nextInt(v + 1 - 1) + 1);
                from = Math.abs(random.nextInt(v + 1 - 1) + 1);

 
                reg.setEdge(to, from);
                count++;
            }

 
            System.out
                    .println("THe Adjacency List Representation of the random graph is: ");

 
            for (int i = 1; i <= v; i++) 
            {
                System.out.print(i + " -> ");
                List<Integer> edgeList = reg.getEdge(i);
                if (edgeList.size() == 0)
                    System.out.print("null");
                else 
                {
                    for (int j = 1;; j++) 
                    {
                        if (j != edgeList.size())
                            System.out.print(edgeList.get(j - 1) + " -> ");
                        else {
                            System.out.print(edgeList.get(j - 1));
                            break;
                        }
                    }
                }
                System.out.println();
            }
        } 
        catch (Exception E) 
        {
            System.out.println("Something went wrong");
        }
        sc.close();
    }

 

void BFS(int s)

    {

        // Mark all the vertices's as not visited(By default

        // set as false)

        int V = 0;
		boolean visited[] = new boolean[V];

        // Create a queue for BFS

        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it

        visited[s]=true;

        queue.add(s);

        while (queue.size() != 0)

        {

            // Dequeue a vertex from queue and print it

            s = queue.poll();

            System.out.print(s+" ");

            // Get all adjacent vertices's of the dequeued vertex s

            // If a adjacent has not been visited, then mark it

            // visited and enqueue it

            Object[] adj = null;
			Iterator<Integer> i = extracted1(s, adj).listIterator();

            while (i.hasNext())

            {

                int n = i.next();

                if (!visited[n])

                {

                    visited[n] = true;

                    queue.add(n);

                }

            }

        }

    }


private List<Integer> extracted1(int s, Object[] adj) {
	return extracted1(s, adj);
}


private List<Integer> extracted11(int s, Object[] adj) {
	return extracted11(s, adj);
}


private List<Integer> extracted2(int s, Object[] adj) {
	return extracted2(s, adj);
}


private List<Integer> extracted3(int s, Object[] adj) {
	return extracted3(s, adj);
}

void GraphDFSUtil(int v, boolean visited[])

{

    // Mark the current node as visited and

    // print it

    visited[v] = true;

    Object count = v ;

    // Recur for all the vertices's adjacent

    // to this vertex

    list<int>::iterator i;

    for (i = adj[v].begin(); i != adj[v].end(); ++i)

        if (!visited[i])

            DFSUtil(i, visited);

}

// DFS traversal of the vertices's reachable from v.

// It uses recursive DFSUtil()

void Graph(int v)

{

    // Mark all the vertices's as not visited

    boolean[] visited1 = new boolean[v];

    for (int i = 0; i < v; i++)

        visited1[i] = false;

    // Call the recursive helper function

    // to print DFS traversal

    GraphDFSUtil(v, visited1);

}

//DIJIKSTRAS ALGORITM

class ShortestPath

{

// A utility function to find the vertex with minimum distance value,

// from the set of vertices's not yet included in shortest path tree

static final int V=9;

int minDistance(int dist[], Boolean sptSet[])

{

// Initialize min value

int min = Integer.MAX_VALUE, min_index=-1;

for (int v = 0; v < V; v++)

if (sptSet[v] == false && dist[v] <= min)

{

min = dist[v];

min_index = v;

}

return min_index;

}

// A utility function to print the constructed distance array

void printSolution(int dist[], int n)

{

System.out.println("Vertex Distance from Source");

for (int i = 0; i < V; i++)

System.out.println(i+" tt "+dist[i]);

}

// Function that implements Dijkstra's single source shortest path

// algorithm for a graph represented using adjacency matrix

// representation

void dijkstra(int graph[][], int src)

{

int dist[] = new int[V]; // The output array. dist[i] will hold

// the shortest distance from src to i

// sptSet[i] will true if vertex i is included in shortest

// path tree or shortest distance from src to i is finalized

Boolean sptSet[] = new Boolean[V];

// Initialize all distances as INFINITE and stpSet[] as false

for (int i = 0; i < V; i++)

{

dist[i] = Integer.MAX_VALUE;

sptSet[i] = false;

}

// Distance of source vertex from itself is always 0

dist[src] = 0;

// Find shortest path for all vertices's

for (int count = 0; count < V-1; count++)

{

// Pick the minimum distance vertex from the set of vertices's

// not yet processed. u is always equal to src in first

// iteration.

int u = minDistance(dist, sptSet);

// Mark the picked vertex as processed

sptSet[u] = true;

// Update dist value of the adjacent vertices's of the

// picked vertex.

for (int v = 0; v < V; v++)

// Update dist[v] only if is not in sptSet, there is an

// edge from u to v, and total weight of path from src to

// v through u is smaller than current value of dist[v]

if (!sptSet[v] && graph[u][v]!=0 &&

dist[u] != Integer.MAX_VALUE &&

dist[u]+graph[u][v] < dist[v])

dist[v] = dist[u] + graph[u][v];

}

// print the constructed distance array

printSolution(dist, V);


}
}
}
