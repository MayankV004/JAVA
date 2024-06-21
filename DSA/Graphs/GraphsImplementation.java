import java.util.*;


public class GraphsImplementation
{
    @SuppressWarnings("unchecked")
    static class Edge
    {
        int src;
        int dest;
        int wt ; // for weighted graph
        public Edge(int src , int dest , int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge> graph[])
    {
        /*
        Here making the graph from null -> empty
        And making Arraylists at every index
        if we add Directly to null it will throw Error
        */ 
        for (int i = 0 ; i < graph.length ; i++)
        {
           graph[i] = new ArrayList<Edge>(); 
        }

        graph[0].add(new Edge(0 , 2 , 2));

        graph[1].add(new Edge(1 , 2 , 10));
        graph[1].add(new Edge(1 , 3 , 0));

        graph[2].add(new Edge(2 , 0 , 2));
        graph[2].add(new Edge(2 , 1 , 10));
        graph[2].add(new Edge(2 , 3 , -1));

        graph[3].add(new Edge(3 , 1 , 0));
        graph[3].add(new Edge(3 , 2 , -1));
 
    }

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 4; //Vertex

        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);
        
        //To get all the neighbours 
        //TC: O(x) -> x = no. of  neighbours
        for (int i = 0 ; i < graph[2].size() ; i++)
        {
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" "+e.wt); // neighbours
        }
    }
}