import java.util.*;


public class Dijkstra
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

        graph[0].add(new Edge(0 , 1 , 2));
        graph[0].add(new Edge(0 , 2 , 4));

        graph[1].add(new Edge(1 , 3 , 7));
        graph[1].add(new Edge(1 , 2 , 1));

        graph[2].add(new Edge(2 , 4 , 3));
        
        graph[3].add(new Edge(3 , 5 , 1));

        graph[4].add(new Edge(4 , 3 , 2));
        graph[4].add(new Edge(4 , 5 , 5));
 
    }
    public static class Pair implements Comparable<Pair>
    {
        int node;
        int dist;

        public Pair(int node , int dist)
        {
            this.node = node;
            this.dist = dist;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.dist - p2.dist; // ascending
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[] , int src , int V)
    { //TC: O(E + ElogV)
        //Initialisation
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i = 0 ; i < V ; i++)
        {
            if (i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis [] = new boolean[V];

        pq.add(new Pair(0 , 0));

        //bfs
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove(); // shortest
            if (!vis[curr.node])
            {
                vis[curr.node] = true;

                for (int i = 0 ; i < graph[curr.node].size() ; i++)
                {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) // relaxation
                    {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v , dist[v]));
                    }
                }
            }
        }

        for (int i : dist)
        {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 6; //Vertex

        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);

        dijkstra(graph , 0 , V);
        
    }
}