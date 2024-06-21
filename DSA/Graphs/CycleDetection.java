import java.util.*;
class CycleDetection
{
    @SuppressWarnings("unchecked")
    static class Edge{
        int src ;
        int dest;
        public Edge(int src , int dest)
        {
            this.src = src;
            this.dest = dest;
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

        graph[0].add(new Edge(0 , 2));
        graph[1].add(new Edge(1 , 0));
        graph[2].add(new Edge(2 , 3));
        // graph[3].add(new Edge(3 , 0));
        
    }
    // For Directed Graph
    public static boolean CycleDetectionDfs(ArrayList<Edge> graph[] , boolean vis[] , int curr , boolean rec[])
    {
        vis[curr] = true;
        rec[curr] = true;
        for(int i = 0 ; i < graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if (rec[e.dest] == true) //cycle
                return true;
            else if(vis[e.dest] == false && CycleDetectionDfs(graph , vis , e.dest , rec))
            {
                return true;
            }
            
        }
        rec[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        // for (int i = 0 ; i < V ; i++) // when graph is Disconnected  
        // {                             // And Also works fine with normal Connected Graphs
        //     if (!vis[i])
        //     {
        //         boolean isCycle = CycleDetectionDfs(graph , vis , 0 , rec);
        //         if (isCycle)
        //         {
        //             System.out.println(isCycle);
        //             break;
        //         }
        //     }
        // }
        System.out.println(CycleDetectionDfs(graph , vis , 0 , rec));

    }
}