import java.util.*;
class TopologicalSort
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

        graph[2].add(new Edge(2 , 3));
      

        graph[3].add(new Edge(3 , 1));
       

        graph[4].add(new Edge(4 , 1));
        graph[4].add(new Edge(4 , 0));
       
        
        graph[5].add(new Edge(5 , 2));
        graph[5].add(new Edge(5 , 0));
        

        
    }
    public static void TopoSort(ArrayList<Edge> graph[] , boolean vis[] , int curr , Stack<Integer> s)
    {
       vis[curr] = true;
       for (int i = 0 ; i < graph[curr].size() ; i++)
       {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
            {
                TopoSort(graph , vis , e.dest , s);
            }
       }
       s.push(curr);
    }
    public static void TopSort(ArrayList<Edge> graph[] , int V)
    {
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        for (int i = 0 ; i < V ; i++)
        {
            if (!vis[i])
            {
                TopoSort(graph , vis , i , s);
            }
        }
        
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ~ ");
        }

    }    

    @SuppressWarnings("unchecked")
    public static void main(String [] args)
    {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        TopSort(graph , V); // O(V + E)
    }
}