import java.util.*;
class AllPathsSrcDest
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
    public static void ModDfs(ArrayList<Edge> graph[] , boolean vis[] , int curr , String path , int target )
    { //TC: O(V^V)
        if (curr == target)
        {
            System.out.println(path);
            return;
        }
        for (int i = 0 ; i < graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false)
            {
                vis[curr] = true;
                ModDfs(graph , vis , e.dest ,path + e.dest +" " , target);
                vis[curr] = false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        int source = 0 , target = 5 ; 
        ModDfs(graph , vis , source , "0 " , target);

    }
}