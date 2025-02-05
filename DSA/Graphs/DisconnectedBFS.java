import java.util.*;


public class DisconnectedBFS
{
    @SuppressWarnings("unchecked")
    static class Edge
    {
        int src;
        int dest;
        
        public Edge(int src , int dest )
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

        graph[0].add(new Edge(0 , 1));
        graph[0].add(new Edge(0 , 2));

        graph[1].add(new Edge(1 , 0));
        graph[1].add(new Edge(1 , 3));

        graph[2].add(new Edge(2 , 0));
        graph[2].add(new Edge(2 , 4));

        graph[3].add(new Edge(3 , 1));
        graph[3].add(new Edge(3 , 4));
        graph[3].add(new Edge(3 , 5));

        graph[4].add(new Edge(4 , 2));
        graph[4].add(new Edge(4 , 3));
        graph[4].add(new Edge(4 , 5));
        
        graph[5].add(new Edge(5 , 3));
        graph[5].add(new Edge(5 , 4));
        graph[5].add(new Edge(5 , 6));

        graph[6].add(new Edge(6 , 5));


 
    }
    public static void bfs(ArrayList<Edge> graph[] , int V , boolean vis[] , int start)
    {
        //TC: O(V + E)
        /*
        This can do BFS of connected as well as Disconnected Graph
        So it is preffered to use.
        */ 
        Queue<Integer> q = new LinkedList<>(); 
        
        q.add(start); // starting point

        while (!q.isEmpty())
        {
            int curr = q.remove();
            if (vis[curr] == false)
            {
                System.out.print(curr +" ");
                vis[curr] = true;
                for (int i = 0 ; i < graph[curr].size() ; i++)
                {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 7; //Vertex

        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);
        boolean vis[] = new boolean[V];
        for (int i = 0 ; i < V ; i++)
        {
            if (vis[i] == false)
            {
                bfs(graph , V , vis , i);
            }
        }
        
    }
}